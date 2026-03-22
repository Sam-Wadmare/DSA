var TimeLimitedCache = function() {
    this.map = new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration (ms)
 * @return {boolean}
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const now = Date.now();
    const expiry = now + duration;

    let exists = false;

    if (this.map.has(key)) {
        const entry = this.map.get(key);
        if (entry.expiry > now) {
            exists = true; // unexpired key exists
        }
    }

    this.map.set(key, { value: value, expiry: expiry });
    return exists;
};

/** 
 * @param {number} key
 * @return {number}
 */
TimeLimitedCache.prototype.get = function(key) {
    const now = Date.now();

    if (!this.map.has(key)) return -1;

    const entry = this.map.get(key);

    if (entry.expiry <= now) {
        this.map.delete(key); // optional cleanup
        return -1;
    }

    return entry.value;
};

/**
 * @return {number}
 */
TimeLimitedCache.prototype.count = function() {
    const now = Date.now();
    let count = 0;

    for (let [key, entry] of this.map) {
        if (entry.expiry > now) {
            count++;
        } else {
            this.map.delete(key); // cleanup expired
        }
    }

    return count;
};