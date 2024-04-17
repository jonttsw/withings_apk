package com.withings.library.healthscore.models.api;

import androidx.appcompat.app.h;
import kotlin.Metadata;
/* compiled from: UserInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/withings/library/healthscore/models/api/UserInfo;", "", "isBornFemaleGender", "", "age", "", "isInUsCountry", "(ZIZ)V", "getAge", "()I", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserInfo {
    private final int age;
    private final boolean isBornFemaleGender;
    private final boolean isInUsCountry;

    public UserInfo(boolean z5, int i11, boolean z11) {
        this.isBornFemaleGender = z5;
        this.age = i11;
        this.isInUsCountry = z11;
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, boolean z5, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z5 = userInfo.isBornFemaleGender;
        }
        if ((i12 & 2) != 0) {
            i11 = userInfo.age;
        }
        if ((i12 & 4) != 0) {
            z11 = userInfo.isInUsCountry;
        }
        return userInfo.copy(z5, i11, z11);
    }

    public final boolean component1() {
        return this.isBornFemaleGender;
    }

    public final int component2() {
        return this.age;
    }

    public final boolean component3() {
        return this.isInUsCountry;
    }

    public final UserInfo copy(boolean z5, int i11, boolean z11) {
        return new UserInfo(z5, i11, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        if (this.isBornFemaleGender == userInfo.isBornFemaleGender && this.age == userInfo.age && this.isInUsCountry == userInfo.isInUsCountry) {
            return true;
        }
        return false;
    }

    public final int getAge() {
        return this.age;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z5 = this.isBornFemaleGender;
        int i11 = 1;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int a11 = h.a(this.age, r02 * 31, 31);
        boolean z11 = this.isInUsCountry;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return a11 + i11;
    }

    public final boolean isBornFemaleGender() {
        return this.isBornFemaleGender;
    }

    public final boolean isInUsCountry() {
        return this.isInUsCountry;
    }

    public String toString() {
        boolean z5 = this.isBornFemaleGender;
        int i11 = this.age;
        boolean z11 = this.isInUsCountry;
        StringBuilder sb2 = new StringBuilder("UserInfo(isBornFemaleGender=");
        sb2.append(z5);
        sb2.append(", age=");
        sb2.append(i11);
        sb2.append(", isInUsCountry=");
        return h.d(sb2, z11, ")");
    }
}
