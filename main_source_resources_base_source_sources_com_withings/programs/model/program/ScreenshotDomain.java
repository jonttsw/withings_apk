package com.withings.programs.model.program;

import androidx.fragment.app.o;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ScreenshotDomain.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/programs/model/program/ScreenshotDomain;", "", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "", "(Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenshotDomain {
    private final String image;

    public ScreenshotDomain(String image) {
        u.j(image, "image");
        this.image = image;
    }

    public static /* synthetic */ ScreenshotDomain copy$default(ScreenshotDomain screenshotDomain, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = screenshotDomain.image;
        }
        return screenshotDomain.copy(str);
    }

    public final String component1() {
        return this.image;
    }

    public final ScreenshotDomain copy(String image) {
        u.j(image, "image");
        return new ScreenshotDomain(image);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ScreenshotDomain) && u.e(this.image, ((ScreenshotDomain) obj).image)) {
            return true;
        }
        return false;
    }

    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.image.hashCode();
    }

    public String toString() {
        return o.d("ScreenshotDomain(image=", this.image, ")");
    }
}
