/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.renderscript;

import android.renderscript.ULong;

/** @hide
 * Vector version of the basic ulong type.
 * Provides four ulong fields packed.
 */
public final class ULong4 {
    public ULong x;
    public ULong y;
    public ULong z;
    public ULong w;

    public ULong4() {
    }

    public ULong4(ULong4 data) {
        this.x = data.x;
        this.y = data.y;
        this.z = data.z;
        this.w = data.w;
    }

    public ULong4(ULong x, ULong y, ULong z, ULong w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 add(ULong4 a, ULong4 b) {
        ULong4 res = new ULong4();
        res.x = ULong.add(a.x, b.x);
        res.y = ULong.add(a.y, b.y);
        res.z = ULong.add(a.z, b.z);
        res.w = ULong.add(a.w, b.w);

        return res;
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(ULong4 value) {
        x.add(value.x);
        y.add(value.y);
        z.add(value.z);
        w.add(value.w);
    }

    /**
     * Vector add
     *
     * @param value
     */
    public void add(ULong value) {
        x.add(value);
        y.add(value);
        z.add(value);
        w.add(value);
    }

    /**
     * Vector add
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 add(ULong4 a, ULong b) {
        ULong4 res = new ULong4();
        res.x = ULong.add(a.x, b);
        res.y = ULong.add(a.y, b);
        res.z = ULong.add(a.z, b);
        res.w = ULong.add(a.w, b);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(ULong4 value) {
        x.sub(value.x);
        y.sub(value.y);
        z.sub(value.z);
        w.sub(value.w);
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 sub(ULong4 a, ULong4 b) {
        ULong4 res = new ULong4();
        res.x = ULong.sub(a.x, b.x);
        res.y = ULong.sub(a.y, b.y);
        res.z = ULong.sub(a.z, b.z);
        res.w = ULong.sub(a.w, b.w);

        return res;
    }

    /**
     * Vector subtraction
     *
     * @param value
     */
    public void sub(ULong value) {
        x.sub(value);
        y.sub(value);
        z.sub(value);
        w.sub(value);
    }

    /**
     * Vector subtraction
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 sub(ULong4 a, ULong b) {
        ULong4 res = new ULong4();
        res.x = ULong.sub(a.x, b);
        res.y = ULong.sub(a.y, b);
        res.z = ULong.sub(a.z, b);
        res.w = ULong.sub(a.w, b);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(ULong4 value) {
        x.mul(value.x);
        y.mul(value.y);
        z.mul(value.z);
        w.mul(value.w);
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 mul(ULong4 a, ULong4 b) {
        ULong4 res = new ULong4();
        res.x = ULong.mul(a.x, b.x);
        res.y = ULong.mul(a.y, b.y);
        res.z = ULong.mul(a.z, b.z);
        res.w = ULong.mul(a.w, b.w);

        return res;
    }

    /**
     * Vector multiplication
     *
     * @param value
     */
    public void mul(ULong value) {
        x.mul(value);
        y.mul(value);
        z.mul(value);
        w.mul(value);
    }

    /**
     * Vector multiplication
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 mul(ULong4 a, ULong b) {
        ULong4 res = new ULong4();
        res.x = ULong.mul(a.x, b);
        res.y = ULong.mul(a.y, b);
        res.z = ULong.mul(a.z, b);
        res.w = ULong.mul(a.w, b);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(ULong4 value) {
        x.div(value.x);
        y.div(value.y);
        z.div(value.z);
        w.div(value.w);
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 div(ULong4 a, ULong4 b) {
        ULong4 res = new ULong4();
        res.x = ULong.div(a.x, b.x);
        res.y = ULong.div(a.y, b.y);
        res.z = ULong.div(a.z, b.z);
        res.w = ULong.div(a.w, b.w);

        return res;
    }

    /**
     * Vector division
     *
     * @param value
     */
    public void div(ULong value) {
        x.div(value);
        y.div(value);
        z.div(value);
        w.div(value);
    }

    /**
     * Vector division
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong4 div(ULong4 a, ULong b) {
        ULong4 res = new ULong4();
        res.x = ULong.div(a.x, b);
        res.y = ULong.div(a.y, b);
        res.z = ULong.div(a.z, b);
        res.w = ULong.div(a.w, b);

        return res;
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @return
     */
    public ULong dotProduct(ULong4 a) {
        ULong mChar = ULong.add(ULong.mul(x, a.x), ULong.mul(y, a.y));
        ULong nChar = ULong.add(ULong.mul(z, a.z), ULong.mul(w, a.w));

        return ULong.add(mChar, nChar);
    }

    /**
     * Vector dot Product
     *
     * @param a
     * @param b
     * @return
     */
    public static ULong dotProduct(ULong4 a, ULong4 b) {
        ULong mChar = ULong.add(ULong.mul(b.x, a.x), ULong.mul(b.y, a.y));
        ULong nChar = ULong.add(ULong.mul(b.z, a.z), ULong.mul(b.w, a.w));

        return ULong.add(mChar, nChar);
    }

    /**
     * Vector add Multiple
     *
     * @param a
     * @param factor
     */
    public void addMultiple(ULong4 a, ULong factor) {
        x.add(ULong.mul(a.x, factor));
        y.add(ULong.mul(a.y, factor));
        z.add(ULong.mul(a.z, factor));
        w.add(ULong.mul(a.w, factor));
    }

    /**
     * Set vector value by ULong4
     *
     * @param a
     */
    public void set(ULong4 a) {
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
        this.w = a.w;
    }

    /**
     * Get vector length
     *
     * @return
     */
    public int length() {
        return 4;
    }

    /**
     * Return the element sum of vector
     *
     * @return
     */
    public ULong elementSum() {
        ULong aChar = ULong.add(x, y);
        ULong bChar = ULong.add(z, w);

        return ULong.add(aChar, bChar);
    }

    /**
     * Get the vector field value by index
     *
     * @param i
     * @return
     */
    public ULong get(int i) {
        switch (i) {
        case 0:
            return x;
        case 1:
            return y;
        case 2:
            return z;
        case 3:
            return w;
        default:
            throw new IndexOutOfBoundsException("Index: i");
        }
    }

    /**
     * Set the vector field value by index
     *
     * @param i
     * @param value
     */
    public void setAt(int i, ULong value) {
        switch (i) {
        case 0:
            x = value;
            return;
        case 1:
            y = value;
            return;
        case 2:
            z = value;
            return;
        case 3:
            w = value;
            return;
        default:
            throw new IndexOutOfBoundsException("Index: i");
        }
    }

    /**
     * Add the vector field value by index
     *
     * @param i
     * @param value
     */
    public void addAt(int i, ULong value) {
        switch (i) {
        case 0:
            x.add(value);
            return;
        case 1:
            y.add(value);
            return;
        case 2:
            z.add(value);
            return;
        case 3:
            w.add(value);
            return;
        default:
            throw new IndexOutOfBoundsException("Index: i");
        }
    }

    /**
     * Set the vector field value
     *
     * @param x
     * @param y
     * @param z
     * @param w
     */
    public void setValues(ULong x, ULong y, ULong z, ULong w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    /**
     * Copy the vector to ULong array
     *
     * @param data
     * @param offset
     */
    public void copyTo(ULong[] data, int offset) {
        data[offset] = x;
        data[offset + 1] = y;
        data[offset + 2] = z;
        data[offset + 3] = w;
    }
}
