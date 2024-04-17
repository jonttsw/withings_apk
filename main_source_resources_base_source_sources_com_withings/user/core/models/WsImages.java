package com.withings.user.core.models;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: WsImages.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/withings/user/core/models/WsImages;", "", "image32", "", "image64", "image128", "image256", "image512", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage128", "()Ljava/lang/String;", "getImage256", "getImage32", "getImage512", "getImage64", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsImages {
    @SerializedName("128x128")
    private final String image128;
    @SerializedName("256x256")
    private final String image256;
    @SerializedName("32x32")
    private final String image32;
    @SerializedName("512x512")
    private final String image512;
    @SerializedName("64x64")
    private final String image64;

    public WsImages() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WsImages copy$default(WsImages wsImages, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsImages.image32;
        }
        if ((i11 & 2) != 0) {
            str2 = wsImages.image64;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = wsImages.image128;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = wsImages.image256;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            str5 = wsImages.image512;
        }
        return wsImages.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.image32;
    }

    public final String component2() {
        return this.image64;
    }

    public final String component3() {
        return this.image128;
    }

    public final String component4() {
        return this.image256;
    }

    public final String component5() {
        return this.image512;
    }

    public final WsImages copy(String str, String str2, String str3, String str4, String str5) {
        return new WsImages(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsImages)) {
            return false;
        }
        WsImages wsImages = (WsImages) obj;
        if (u.e(this.image32, wsImages.image32) && u.e(this.image64, wsImages.image64) && u.e(this.image128, wsImages.image128) && u.e(this.image256, wsImages.image256) && u.e(this.image512, wsImages.image512)) {
            return true;
        }
        return false;
    }

    public final String getImage128() {
        return this.image128;
    }

    public final String getImage256() {
        return this.image256;
    }

    public final String getImage32() {
        return this.image32;
    }

    public final String getImage512() {
        return this.image512;
    }

    public final String getImage64() {
        return this.image64;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.image32;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        String str2 = this.image64;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.image128;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str4 = this.image256;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str5 = this.image512;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return i15 + i11;
    }

    public String toString() {
        String str = this.image32;
        String str2 = this.image64;
        String str3 = this.image128;
        String str4 = this.image256;
        String str5 = this.image512;
        StringBuilder b10 = l0.b("WsImages(image32=", str, ", image64=", str2, ", image128=");
        b.d(b10, str3, ", image256=", str4, ", image512=");
        return y1.e(b10, str5, ")");
    }

    public WsImages(String str, String str2, String str3, String str4, String str5) {
        this.image32 = str;
        this.image64 = str2;
        this.image128 = str3;
        this.image256 = str4;
        this.image512 = str5;
    }

    public /* synthetic */ WsImages(String str, String str2, String str3, String str4, String str5, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}
