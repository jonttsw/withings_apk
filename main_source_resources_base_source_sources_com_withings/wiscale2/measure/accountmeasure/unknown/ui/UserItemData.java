package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.withings.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: UserAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/unknown/ui/UserItemData;", "Landroid/os/Parcelable;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UserItemData implements Parcelable {
    public static final Parcelable.Creator<UserItemData> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final User f58339a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f58340b;

    /* compiled from: UserAdapter.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<UserItemData> {
        @Override // android.os.Parcelable.Creator
        public final UserItemData createFromParcel(Parcel parcel) {
            boolean z5;
            Boolean valueOf;
            u.j(parcel, "parcel");
            User user = (User) parcel.readParcelable(UserItemData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                valueOf = Boolean.valueOf(z5);
            }
            return new UserItemData(user, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final UserItemData[] newArray(int i11) {
            return new UserItemData[i11];
        }
    }

    public UserItemData(User user, Boolean bool) {
        u.j(user, "user");
        this.f58339a = user;
        this.f58340b = bool;
    }

    public final User a() {
        return this.f58339a;
    }

    public final Boolean b() {
        return this.f58340b;
    }

    public final User c() {
        return this.f58339a;
    }

    public final Boolean d() {
        return this.f58340b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserItemData)) {
            return false;
        }
        UserItemData userItemData = (UserItemData) obj;
        if (u.e(this.f58339a, userItemData.f58339a) && u.e(this.f58340b, userItemData.f58340b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f58339a.hashCode() * 31;
        Boolean bool = this.f58340b;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "UserItemData(user=" + this.f58339a + ", isUserSelected=" + this.f58340b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        int i12;
        u.j(out, "out");
        out.writeParcelable(this.f58339a, i11);
        Boolean bool = this.f58340b;
        if (bool == null) {
            i12 = 0;
        } else {
            out.writeInt(1);
            i12 = bool.booleanValue();
        }
        out.writeInt(i12);
    }
}
