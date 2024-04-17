package com.withings.webradio.model;

import androidx.appcompat.widget.v0;
import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WebRadio.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/withings/webradio/model/WebRadio;", "", "id", "", "title", "slogan", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImageUrl", "getSlogan", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebRadio {

    /* renamed from: id  reason: collision with root package name */
    private final String f46839id;
    @SerializedName(HealthUserProfile.USER_PROFILE_KEY_IMAGE)
    private final String imageUrl;
    private final String slogan;
    private final String title;

    public WebRadio(String id2, String title, String slogan, String imageUrl) {
        u.j(id2, "id");
        u.j(title, "title");
        u.j(slogan, "slogan");
        u.j(imageUrl, "imageUrl");
        this.f46839id = id2;
        this.title = title;
        this.slogan = slogan;
        this.imageUrl = imageUrl;
    }

    public static /* synthetic */ WebRadio copy$default(WebRadio webRadio, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = webRadio.f46839id;
        }
        if ((i11 & 2) != 0) {
            str2 = webRadio.title;
        }
        if ((i11 & 4) != 0) {
            str3 = webRadio.slogan;
        }
        if ((i11 & 8) != 0) {
            str4 = webRadio.imageUrl;
        }
        return webRadio.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f46839id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.slogan;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final WebRadio copy(String id2, String title, String slogan, String imageUrl) {
        u.j(id2, "id");
        u.j(title, "title");
        u.j(slogan, "slogan");
        u.j(imageUrl, "imageUrl");
        return new WebRadio(id2, title, slogan, imageUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRadio)) {
            return false;
        }
        WebRadio webRadio = (WebRadio) obj;
        if (u.e(this.f46839id, webRadio.f46839id) && u.e(this.title, webRadio.title) && u.e(this.slogan, webRadio.slogan) && u.e(this.imageUrl, webRadio.imageUrl)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f46839id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSlogan() {
        return this.slogan;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.imageUrl.hashCode() + d.c(this.slogan, d.c(this.title, this.f46839id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.f46839id;
        String str2 = this.title;
        return v0.d(l0.b("WebRadio(id=", str, ", title=", str2, ", slogan="), this.slogan, ", imageUrl=", this.imageUrl, ")");
    }
}
