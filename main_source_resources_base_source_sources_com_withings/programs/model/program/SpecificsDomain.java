package com.withings.programs.model.program;

import androidx.camera.camera2.internal.l0;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: SpecificsDomain.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017¨\u00069"}, d2 = {"Lcom/withings/programs/model/program/SpecificsDomain;", "", "about", "", "cta", "features", "", "Lcom/withings/programs/model/program/FeatureDomain;", "imageFull", "imagePreview", XHTMLText.STYLE, "Lcom/withings/programs/model/program/StyleDomain;", "subtitle", "tags", "title", "devices", "Lcom/withings/programs/model/program/DeviceDomain;", "screenshots", "Lcom/withings/programs/model/program/ScreenshotDomain;", "sponsors", "Lcom/withings/programs/model/program/SponsorsDomain;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/withings/programs/model/program/StyleDomain;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/withings/programs/model/program/SponsorsDomain;)V", "getAbout", "()Ljava/lang/String;", "getCta", "getDevices", "()Ljava/util/List;", "getFeatures", "getImageFull", "getImagePreview", "getScreenshots", "getSponsors", "()Lcom/withings/programs/model/program/SponsorsDomain;", "getStyle", "()Lcom/withings/programs/model/program/StyleDomain;", "getSubtitle", "getTags", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpecificsDomain {
    private final String about;
    private final String cta;
    private final List<DeviceDomain> devices;
    private final List<FeatureDomain> features;
    private final String imageFull;
    private final String imagePreview;
    private final List<ScreenshotDomain> screenshots;
    private final SponsorsDomain sponsors;
    private final StyleDomain style;
    private final String subtitle;
    private final List<String> tags;
    private final String title;

    public SpecificsDomain(String about, String cta, List<FeatureDomain> features, String imageFull, String imagePreview, StyleDomain style, String subtitle, List<String> tags, String title, List<DeviceDomain> list, List<ScreenshotDomain> list2, SponsorsDomain sponsorsDomain) {
        u.j(about, "about");
        u.j(cta, "cta");
        u.j(features, "features");
        u.j(imageFull, "imageFull");
        u.j(imagePreview, "imagePreview");
        u.j(style, "style");
        u.j(subtitle, "subtitle");
        u.j(tags, "tags");
        u.j(title, "title");
        this.about = about;
        this.cta = cta;
        this.features = features;
        this.imageFull = imageFull;
        this.imagePreview = imagePreview;
        this.style = style;
        this.subtitle = subtitle;
        this.tags = tags;
        this.title = title;
        this.devices = list;
        this.screenshots = list2;
        this.sponsors = sponsorsDomain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpecificsDomain copy$default(SpecificsDomain specificsDomain, String str, String str2, List list, String str3, String str4, StyleDomain styleDomain, String str5, List list2, String str6, List list3, List list4, SponsorsDomain sponsorsDomain, int i11, Object obj) {
        String str7;
        String str8;
        List<FeatureDomain> list5;
        String str9;
        String str10;
        StyleDomain styleDomain2;
        String str11;
        List<String> list6;
        String str12;
        List<DeviceDomain> list7;
        List<ScreenshotDomain> list8;
        SponsorsDomain sponsorsDomain2;
        if ((i11 & 1) != 0) {
            str7 = specificsDomain.about;
        } else {
            str7 = str;
        }
        if ((i11 & 2) != 0) {
            str8 = specificsDomain.cta;
        } else {
            str8 = str2;
        }
        if ((i11 & 4) != 0) {
            list5 = specificsDomain.features;
        } else {
            list5 = list;
        }
        if ((i11 & 8) != 0) {
            str9 = specificsDomain.imageFull;
        } else {
            str9 = str3;
        }
        if ((i11 & 16) != 0) {
            str10 = specificsDomain.imagePreview;
        } else {
            str10 = str4;
        }
        if ((i11 & 32) != 0) {
            styleDomain2 = specificsDomain.style;
        } else {
            styleDomain2 = styleDomain;
        }
        if ((i11 & 64) != 0) {
            str11 = specificsDomain.subtitle;
        } else {
            str11 = str5;
        }
        if ((i11 & 128) != 0) {
            list6 = specificsDomain.tags;
        } else {
            list6 = list2;
        }
        if ((i11 & 256) != 0) {
            str12 = specificsDomain.title;
        } else {
            str12 = str6;
        }
        if ((i11 & 512) != 0) {
            list7 = specificsDomain.devices;
        } else {
            list7 = list3;
        }
        if ((i11 & 1024) != 0) {
            list8 = specificsDomain.screenshots;
        } else {
            list8 = list4;
        }
        if ((i11 & ModuleCopy.f28574b) != 0) {
            sponsorsDomain2 = specificsDomain.sponsors;
        } else {
            sponsorsDomain2 = sponsorsDomain;
        }
        return specificsDomain.copy(str7, str8, list5, str9, str10, styleDomain2, str11, list6, str12, list7, list8, sponsorsDomain2);
    }

    public final String component1() {
        return this.about;
    }

    public final List<DeviceDomain> component10() {
        return this.devices;
    }

    public final List<ScreenshotDomain> component11() {
        return this.screenshots;
    }

    public final SponsorsDomain component12() {
        return this.sponsors;
    }

    public final String component2() {
        return this.cta;
    }

    public final List<FeatureDomain> component3() {
        return this.features;
    }

    public final String component4() {
        return this.imageFull;
    }

    public final String component5() {
        return this.imagePreview;
    }

    public final StyleDomain component6() {
        return this.style;
    }

    public final String component7() {
        return this.subtitle;
    }

    public final List<String> component8() {
        return this.tags;
    }

    public final String component9() {
        return this.title;
    }

    public final SpecificsDomain copy(String about, String cta, List<FeatureDomain> features, String imageFull, String imagePreview, StyleDomain style, String subtitle, List<String> tags, String title, List<DeviceDomain> list, List<ScreenshotDomain> list2, SponsorsDomain sponsorsDomain) {
        u.j(about, "about");
        u.j(cta, "cta");
        u.j(features, "features");
        u.j(imageFull, "imageFull");
        u.j(imagePreview, "imagePreview");
        u.j(style, "style");
        u.j(subtitle, "subtitle");
        u.j(tags, "tags");
        u.j(title, "title");
        return new SpecificsDomain(about, cta, features, imageFull, imagePreview, style, subtitle, tags, title, list, list2, sponsorsDomain);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecificsDomain)) {
            return false;
        }
        SpecificsDomain specificsDomain = (SpecificsDomain) obj;
        if (u.e(this.about, specificsDomain.about) && u.e(this.cta, specificsDomain.cta) && u.e(this.features, specificsDomain.features) && u.e(this.imageFull, specificsDomain.imageFull) && u.e(this.imagePreview, specificsDomain.imagePreview) && u.e(this.style, specificsDomain.style) && u.e(this.subtitle, specificsDomain.subtitle) && u.e(this.tags, specificsDomain.tags) && u.e(this.title, specificsDomain.title) && u.e(this.devices, specificsDomain.devices) && u.e(this.screenshots, specificsDomain.screenshots) && u.e(this.sponsors, specificsDomain.sponsors)) {
            return true;
        }
        return false;
    }

    public final String getAbout() {
        return this.about;
    }

    public final String getCta() {
        return this.cta;
    }

    public final List<DeviceDomain> getDevices() {
        return this.devices;
    }

    public final List<FeatureDomain> getFeatures() {
        return this.features;
    }

    public final String getImageFull() {
        return this.imageFull;
    }

    public final String getImagePreview() {
        return this.imagePreview;
    }

    public final List<ScreenshotDomain> getScreenshots() {
        return this.screenshots;
    }

    public final SponsorsDomain getSponsors() {
        return this.sponsors;
    }

    public final StyleDomain getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c11 = d.c(this.title, e.b(this.tags, d.c(this.subtitle, (this.style.hashCode() + d.c(this.imagePreview, d.c(this.imageFull, e.b(this.features, d.c(this.cta, this.about.hashCode() * 31, 31), 31), 31), 31)) * 31, 31), 31), 31);
        List<DeviceDomain> list = this.devices;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        List<ScreenshotDomain> list2 = this.screenshots;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        SponsorsDomain sponsorsDomain = this.sponsors;
        if (sponsorsDomain != null) {
            i11 = sponsorsDomain.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        String str = this.about;
        String str2 = this.cta;
        List<FeatureDomain> list = this.features;
        String str3 = this.imageFull;
        String str4 = this.imagePreview;
        StyleDomain styleDomain = this.style;
        String str5 = this.subtitle;
        List<String> list2 = this.tags;
        String str6 = this.title;
        List<DeviceDomain> list3 = this.devices;
        List<ScreenshotDomain> list4 = this.screenshots;
        SponsorsDomain sponsorsDomain = this.sponsors;
        StringBuilder b10 = l0.b("SpecificsDomain(about=", str, ", cta=", str2, ", features=");
        b10.append(list);
        b10.append(", imageFull=");
        b10.append(str3);
        b10.append(", imagePreview=");
        b10.append(str4);
        b10.append(", style=");
        b10.append(styleDomain);
        b10.append(", subtitle=");
        c.d(b10, str5, ", tags=", list2, ", title=");
        c.d(b10, str6, ", devices=", list3, ", screenshots=");
        b10.append(list4);
        b10.append(", sponsors=");
        b10.append(sponsorsDomain);
        b10.append(")");
        return b10.toString();
    }

    public /* synthetic */ SpecificsDomain(String str, String str2, List list, String str3, String str4, StyleDomain styleDomain, String str5, List list2, String str6, List list3, List list4, SponsorsDomain sponsorsDomain, int i11, m mVar) {
        this(str, str2, list, str3, str4, styleDomain, str5, list2, str6, (i11 & 512) != 0 ? null : list3, (i11 & 1024) != 0 ? null : list4, (i11 & ModuleCopy.f28574b) != 0 ? null : sponsorsDomain);
    }
}
