package com.withings.programs.model.programoverview;

import am.m;
import am.p;
import androidx.camera.core.y1;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.contentproviders.model.content.ContentAccessLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ProgramOverview.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\"\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0005J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0096\u0001\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\"\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\bJ\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010\u0005R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u0010\bR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b0\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b1\u0010\bR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b2\u0010\bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b3\u0010\u0005R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b4\u0010\u0005R\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b5\u0010\bR\u0017\u0010 \u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b \u00106\u001a\u0004\b \u0010\u0013R\u0019\u0010!\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b7\u0010\bR\u0017\u0010\"\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\b9\u0010\u0017¨\u0006<"}, d2 = {"Lcom/withings/programs/model/programoverview/ProgramOverview;", "", "", "Lcom/withings/programs/model/programoverview/ProgramOverviewFeature;", "component1", "()Ljava/util/List;", "", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "Lam/m;", "component6", "Lam/p;", "component7", "component8", "", "component9", "()Z", "component10", "Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "component11", "()Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "programOverviewFeatures", HealthConstants.FoodInfo.DESCRIPTION, "deviceDescription", "featureImage", "identifier", "recommendedDevices", "tags", "title", "isNew", "categoryIconId", "accessLevel", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lcom/withings/contentproviders/model/content/ContentAccessLevel;)Lcom/withings/programs/model/programoverview/ProgramOverview;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProgramOverviewFeatures", "Ljava/lang/String;", "getDescription", "getDeviceDescription", "getFeatureImage", "getIdentifier", "getRecommendedDevices", "getTags", "getTitle", "Z", "getCategoryIconId", "Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "getAccessLevel", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lcom/withings/contentproviders/model/content/ContentAccessLevel;)V", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProgramOverview {
    private final ContentAccessLevel accessLevel;
    private final String categoryIconId;
    private final String description;
    private final String deviceDescription;
    private final String featureImage;
    private final String identifier;
    private final boolean isNew;
    private final List<ProgramOverviewFeature> programOverviewFeatures;
    private final List<m> recommendedDevices;
    private final List<p> tags;
    private final String title;

    public ProgramOverview(List<ProgramOverviewFeature> programOverviewFeatures, String description, String str, String featureImage, String str2, List<m> recommendedDevices, List<p> tags, String title, boolean z5, String str3, ContentAccessLevel accessLevel) {
        u.j(programOverviewFeatures, "programOverviewFeatures");
        u.j(description, "description");
        u.j(featureImage, "featureImage");
        u.j(recommendedDevices, "recommendedDevices");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(accessLevel, "accessLevel");
        this.programOverviewFeatures = programOverviewFeatures;
        this.description = description;
        this.deviceDescription = str;
        this.featureImage = featureImage;
        this.identifier = str2;
        this.recommendedDevices = recommendedDevices;
        this.tags = tags;
        this.title = title;
        this.isNew = z5;
        this.categoryIconId = str3;
        this.accessLevel = accessLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgramOverview copy$default(ProgramOverview programOverview, List list, String str, String str2, String str3, String str4, List list2, List list3, String str5, boolean z5, String str6, ContentAccessLevel contentAccessLevel, int i11, Object obj) {
        List<ProgramOverviewFeature> list4;
        String str7;
        String str8;
        String str9;
        String str10;
        List<m> list5;
        List<p> list6;
        String str11;
        boolean z11;
        String str12;
        ContentAccessLevel contentAccessLevel2;
        if ((i11 & 1) != 0) {
            list4 = programOverview.programOverviewFeatures;
        } else {
            list4 = list;
        }
        if ((i11 & 2) != 0) {
            str7 = programOverview.description;
        } else {
            str7 = str;
        }
        if ((i11 & 4) != 0) {
            str8 = programOverview.deviceDescription;
        } else {
            str8 = str2;
        }
        if ((i11 & 8) != 0) {
            str9 = programOverview.featureImage;
        } else {
            str9 = str3;
        }
        if ((i11 & 16) != 0) {
            str10 = programOverview.identifier;
        } else {
            str10 = str4;
        }
        if ((i11 & 32) != 0) {
            list5 = programOverview.recommendedDevices;
        } else {
            list5 = list2;
        }
        if ((i11 & 64) != 0) {
            list6 = programOverview.tags;
        } else {
            list6 = list3;
        }
        if ((i11 & 128) != 0) {
            str11 = programOverview.title;
        } else {
            str11 = str5;
        }
        if ((i11 & 256) != 0) {
            z11 = programOverview.isNew;
        } else {
            z11 = z5;
        }
        if ((i11 & 512) != 0) {
            str12 = programOverview.categoryIconId;
        } else {
            str12 = str6;
        }
        if ((i11 & 1024) != 0) {
            contentAccessLevel2 = programOverview.accessLevel;
        } else {
            contentAccessLevel2 = contentAccessLevel;
        }
        return programOverview.copy(list4, str7, str8, str9, str10, list5, list6, str11, z11, str12, contentAccessLevel2);
    }

    public final List<ProgramOverviewFeature> component1() {
        return this.programOverviewFeatures;
    }

    public final String component10() {
        return this.categoryIconId;
    }

    public final ContentAccessLevel component11() {
        return this.accessLevel;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.deviceDescription;
    }

    public final String component4() {
        return this.featureImage;
    }

    public final String component5() {
        return this.identifier;
    }

    public final List<m> component6() {
        return this.recommendedDevices;
    }

    public final List<p> component7() {
        return this.tags;
    }

    public final String component8() {
        return this.title;
    }

    public final boolean component9() {
        return this.isNew;
    }

    public final ProgramOverview copy(List<ProgramOverviewFeature> programOverviewFeatures, String description, String str, String featureImage, String str2, List<m> recommendedDevices, List<p> tags, String title, boolean z5, String str3, ContentAccessLevel accessLevel) {
        u.j(programOverviewFeatures, "programOverviewFeatures");
        u.j(description, "description");
        u.j(featureImage, "featureImage");
        u.j(recommendedDevices, "recommendedDevices");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(accessLevel, "accessLevel");
        return new ProgramOverview(programOverviewFeatures, description, str, featureImage, str2, recommendedDevices, tags, title, z5, str3, accessLevel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramOverview)) {
            return false;
        }
        ProgramOverview programOverview = (ProgramOverview) obj;
        if (u.e(this.programOverviewFeatures, programOverview.programOverviewFeatures) && u.e(this.description, programOverview.description) && u.e(this.deviceDescription, programOverview.deviceDescription) && u.e(this.featureImage, programOverview.featureImage) && u.e(this.identifier, programOverview.identifier) && u.e(this.recommendedDevices, programOverview.recommendedDevices) && u.e(this.tags, programOverview.tags) && u.e(this.title, programOverview.title) && this.isNew == programOverview.isNew && u.e(this.categoryIconId, programOverview.categoryIconId) && this.accessLevel == programOverview.accessLevel) {
            return true;
        }
        return false;
    }

    public final ContentAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public final String getCategoryIconId() {
        return this.categoryIconId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeviceDescription() {
        return this.deviceDescription;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<ProgramOverviewFeature> getProgramOverviewFeatures() {
        return this.programOverviewFeatures;
    }

    public final List<m> getRecommendedDevices() {
        return this.recommendedDevices;
    }

    public final List<p> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c11 = d.c(this.description, this.programOverviewFeatures.hashCode() * 31, 31);
        String str = this.deviceDescription;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c12 = d.c(this.featureImage, (c11 + hashCode) * 31, 31);
        String str2 = this.identifier;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a11 = y1.a(this.isNew, d.c(this.title, e.b(this.tags, e.b(this.recommendedDevices, (c12 + hashCode2) * 31, 31), 31), 31), 31);
        String str3 = this.categoryIconId;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return this.accessLevel.hashCode() + ((a11 + i11) * 31);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        List<ProgramOverviewFeature> list = this.programOverviewFeatures;
        String str = this.description;
        String str2 = this.deviceDescription;
        String str3 = this.featureImage;
        String str4 = this.identifier;
        List<m> list2 = this.recommendedDevices;
        List<p> list3 = this.tags;
        String str5 = this.title;
        boolean z5 = this.isNew;
        String str6 = this.categoryIconId;
        ContentAccessLevel contentAccessLevel = this.accessLevel;
        StringBuilder sb2 = new StringBuilder("ProgramOverview(programOverviewFeatures=");
        sb2.append(list);
        sb2.append(", description=");
        sb2.append(str);
        sb2.append(", deviceDescription=");
        b.d(sb2, str2, ", featureImage=", str3, ", identifier=");
        c.d(sb2, str4, ", recommendedDevices=", list2, ", tags=");
        sb2.append(list3);
        sb2.append(", title=");
        sb2.append(str5);
        sb2.append(", isNew=");
        sb2.append(z5);
        sb2.append(", categoryIconId=");
        sb2.append(str6);
        sb2.append(", accessLevel=");
        sb2.append(contentAccessLevel);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ProgramOverview(List list, String str, String str2, String str3, String str4, List list2, List list3, String str5, boolean z5, String str6, ContentAccessLevel contentAccessLevel, int i11, kotlin.jvm.internal.m mVar) {
        this(list, str, str2, str3, str4, list2, list3, str5, (i11 & 256) != 0 ? true : z5, (i11 & 512) != 0 ? null : str6, contentAccessLevel);
    }
}
