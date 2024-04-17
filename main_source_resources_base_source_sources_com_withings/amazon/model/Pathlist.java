package com.withings.amazon.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class Pathlist implements Parcelable, Serializable {
    public static final Parcelable.Creator<Pathlist> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private String f31275a;

    /* renamed from: b  reason: collision with root package name */
    private String f31276b;

    /* loaded from: classes3.dex */
    final class a implements Parcelable.Creator<Pathlist> {
        @Override // android.os.Parcelable.Creator
        public final Pathlist createFromParcel(Parcel parcel) {
            return new Pathlist(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Pathlist[] newArray(int i11) {
            return new Pathlist[i11];
        }
    }

    public Pathlist() {
    }

    public final String a() {
        return this.f31275a;
    }

    public final String b() {
        return this.f31276b;
    }

    public final JsonObject c() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("sign", this.f31275a);
        jsonObject.addProperty("url", this.f31276b);
        return jsonObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pathlist)) {
            return false;
        }
        Pathlist pathlist = (Pathlist) obj;
        if (TextUtils.equals(pathlist.f31275a, this.f31275a)) {
            if (TextUtils.equals(pathlist.f31276b, this.f31276b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f31275a);
        parcel.writeString(this.f31276b);
    }

    protected Pathlist(Parcel parcel) {
        this.f31275a = parcel.readString();
        this.f31276b = parcel.readString();
    }
}
