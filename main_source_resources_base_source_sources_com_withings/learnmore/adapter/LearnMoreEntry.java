package com.withings.learnmore.adapter;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: LearnMore.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/withings/learnmore/adapter/LearnMoreEntry;", "", "url", "", Constants.ScionAnalytics.PARAM_LABEL, "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getLabel", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "learnmore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LearnMoreEntry {
    public static final int $stable = 0;
    @SerializedName("image_url")
    private final String imageUrl;
    private final String label;
    private final String url;

    public LearnMoreEntry(String url, String label, String str) {
        u.j(url, "url");
        u.j(label, "label");
        this.url = url;
        this.label = label;
        this.imageUrl = str;
    }

    public static /* synthetic */ LearnMoreEntry copy$default(LearnMoreEntry learnMoreEntry, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = learnMoreEntry.url;
        }
        if ((i11 & 2) != 0) {
            str2 = learnMoreEntry.label;
        }
        if ((i11 & 4) != 0) {
            str3 = learnMoreEntry.imageUrl;
        }
        return learnMoreEntry.copy(str, str2, str3);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final LearnMoreEntry copy(String url, String label, String str) {
        u.j(url, "url");
        u.j(label, "label");
        return new LearnMoreEntry(url, label, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnMoreEntry)) {
            return false;
        }
        LearnMoreEntry learnMoreEntry = (LearnMoreEntry) obj;
        if (u.e(this.url, learnMoreEntry.url) && u.e(this.label, learnMoreEntry.label) && u.e(this.imageUrl, learnMoreEntry.imageUrl)) {
            return true;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int c11 = d.c(this.label, this.url.hashCode() * 31, 31);
        String str = this.imageUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c11 + hashCode;
    }

    public String toString() {
        String str = this.url;
        String str2 = this.label;
        return y1.e(l0.b("LearnMoreEntry(url=", str, ", label=", str2, ", imageUrl="), this.imageUrl, ")");
    }

    public /* synthetic */ LearnMoreEntry(String str, String str2, String str3, int i11, m mVar) {
        this(str, str2, (i11 & 4) != 0 ? null : str3);
    }
}
