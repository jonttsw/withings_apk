package com.withings.programs.model.program;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SponsorsDomain.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/withings/programs/model/program/SponsorsDomain;", "", HealthConstants.FoodInfo.DESCRIPTION, "", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getImage", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SponsorsDomain {
    private final String description;
    private final String image;
    private final String name;

    public SponsorsDomain(String description, String image, String name) {
        u.j(description, "description");
        u.j(image, "image");
        u.j(name, "name");
        this.description = description;
        this.image = image;
        this.name = name;
    }

    public static /* synthetic */ SponsorsDomain copy$default(SponsorsDomain sponsorsDomain, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sponsorsDomain.description;
        }
        if ((i11 & 2) != 0) {
            str2 = sponsorsDomain.image;
        }
        if ((i11 & 4) != 0) {
            str3 = sponsorsDomain.name;
        }
        return sponsorsDomain.copy(str, str2, str3);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.image;
    }

    public final String component3() {
        return this.name;
    }

    public final SponsorsDomain copy(String description, String image, String name) {
        u.j(description, "description");
        u.j(image, "image");
        u.j(name, "name");
        return new SponsorsDomain(description, image, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorsDomain)) {
            return false;
        }
        SponsorsDomain sponsorsDomain = (SponsorsDomain) obj;
        if (u.e(this.description, sponsorsDomain.description) && u.e(this.image, sponsorsDomain.image) && u.e(this.name, sponsorsDomain.name)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + d.c(this.image, this.description.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.image;
        return y1.e(l0.b("SponsorsDomain(description=", str, ", image=", str2, ", name="), this.name, ")");
    }
}
