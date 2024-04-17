package com.withings.programs.model.programoverview;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ProgramOverview.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/withings/programs/model/programoverview/ProgramOverviewFeature;", "", "featureImage", "", "subtitle", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeatureImage", "()Ljava/lang/String;", "getSubtitle", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramOverviewFeature {
    private final String featureImage;
    private final String subtitle;
    private final String title;

    public ProgramOverviewFeature(String featureImage, String subtitle, String title) {
        u.j(featureImage, "featureImage");
        u.j(subtitle, "subtitle");
        u.j(title, "title");
        this.featureImage = featureImage;
        this.subtitle = subtitle;
        this.title = title;
    }

    public static /* synthetic */ ProgramOverviewFeature copy$default(ProgramOverviewFeature programOverviewFeature, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = programOverviewFeature.featureImage;
        }
        if ((i11 & 2) != 0) {
            str2 = programOverviewFeature.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = programOverviewFeature.title;
        }
        return programOverviewFeature.copy(str, str2, str3);
    }

    public final String component1() {
        return this.featureImage;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.title;
    }

    public final ProgramOverviewFeature copy(String featureImage, String subtitle, String title) {
        u.j(featureImage, "featureImage");
        u.j(subtitle, "subtitle");
        u.j(title, "title");
        return new ProgramOverviewFeature(featureImage, subtitle, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramOverviewFeature)) {
            return false;
        }
        ProgramOverviewFeature programOverviewFeature = (ProgramOverviewFeature) obj;
        if (u.e(this.featureImage, programOverviewFeature.featureImage) && u.e(this.subtitle, programOverviewFeature.subtitle) && u.e(this.title, programOverviewFeature.title)) {
            return true;
        }
        return false;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + d.c(this.subtitle, this.featureImage.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.featureImage;
        String str2 = this.subtitle;
        return y1.e(l0.b("ProgramOverviewFeature(featureImage=", str, ", subtitle=", str2, ", title="), this.title, ")");
    }
}
