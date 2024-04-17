package com.withings.programs.model.programoverview;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.healthplus.contentscreens.ui.model.TagUi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import s10.a;
/* compiled from: ProgramOverviewUi.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\nHÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\tJ\u0088\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00072\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0004J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b*\u0010\u0004R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b+\u0010\u0004R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b\u0018\u0010\tR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010\rR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b/\u0010\rR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\b0\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b\u001c\u0010\tR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b1\u0010\u0004R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b\u001e\u0010\t¨\u00064"}, d2 = {"Lcom/withings/programs/model/programoverview/ProgramOverviewUi;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "component4", "()Z", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "component5", "()Ljava/util/List;", "Ls10/a;", "component6", "Lkk/a;", "component7", "component8", "component9", "component10", "title", HealthConstants.FoodInfo.DESCRIPTION, "imageURL", "isNew", "tags", "includedContent", "recommendedDevices", "isAppCapability", "categoryIconId", "isAccessible", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Z)Lcom/withings/programs/model/programoverview/ProgramOverviewUi;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getImageURL", "Z", "Ljava/util/List;", "getTags", "getIncludedContent", "getRecommendedDevices", "getCategoryIconId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Z)V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProgramOverviewUi {
    public static final int $stable = 8;
    private final String categoryIconId;
    private final String description;
    private final String imageURL;
    private final List<a> includedContent;
    private final boolean isAccessible;
    private final boolean isAppCapability;
    private final boolean isNew;
    private final List<kk.a> recommendedDevices;
    private final List<TagUi> tags;
    private final String title;

    public ProgramOverviewUi(String title, String description, String imageURL, boolean z5, List<TagUi> tags, List<a> includedContent, List<kk.a> recommendedDevices, boolean z11, String str, boolean z12) {
        u.j(title, "title");
        u.j(description, "description");
        u.j(imageURL, "imageURL");
        u.j(tags, "tags");
        u.j(includedContent, "includedContent");
        u.j(recommendedDevices, "recommendedDevices");
        this.title = title;
        this.description = description;
        this.imageURL = imageURL;
        this.isNew = z5;
        this.tags = tags;
        this.includedContent = includedContent;
        this.recommendedDevices = recommendedDevices;
        this.isAppCapability = z11;
        this.categoryIconId = str;
        this.isAccessible = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgramOverviewUi copy$default(ProgramOverviewUi programOverviewUi, String str, String str2, String str3, boolean z5, List list, List list2, List list3, boolean z11, String str4, boolean z12, int i11, Object obj) {
        String str5;
        String str6;
        String str7;
        boolean z13;
        List<TagUi> list4;
        List<a> list5;
        List<kk.a> list6;
        boolean z14;
        String str8;
        boolean z15;
        if ((i11 & 1) != 0) {
            str5 = programOverviewUi.title;
        } else {
            str5 = str;
        }
        if ((i11 & 2) != 0) {
            str6 = programOverviewUi.description;
        } else {
            str6 = str2;
        }
        if ((i11 & 4) != 0) {
            str7 = programOverviewUi.imageURL;
        } else {
            str7 = str3;
        }
        if ((i11 & 8) != 0) {
            z13 = programOverviewUi.isNew;
        } else {
            z13 = z5;
        }
        if ((i11 & 16) != 0) {
            list4 = programOverviewUi.tags;
        } else {
            list4 = list;
        }
        if ((i11 & 32) != 0) {
            list5 = programOverviewUi.includedContent;
        } else {
            list5 = list2;
        }
        if ((i11 & 64) != 0) {
            list6 = programOverviewUi.recommendedDevices;
        } else {
            list6 = list3;
        }
        if ((i11 & 128) != 0) {
            z14 = programOverviewUi.isAppCapability;
        } else {
            z14 = z11;
        }
        if ((i11 & 256) != 0) {
            str8 = programOverviewUi.categoryIconId;
        } else {
            str8 = str4;
        }
        if ((i11 & 512) != 0) {
            z15 = programOverviewUi.isAccessible;
        } else {
            z15 = z12;
        }
        return programOverviewUi.copy(str5, str6, str7, z13, list4, list5, list6, z14, str8, z15);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component10() {
        return this.isAccessible;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.imageURL;
    }

    public final boolean component4() {
        return this.isNew;
    }

    public final List<TagUi> component5() {
        return this.tags;
    }

    public final List<a> component6() {
        return this.includedContent;
    }

    public final List<kk.a> component7() {
        return this.recommendedDevices;
    }

    public final boolean component8() {
        return this.isAppCapability;
    }

    public final String component9() {
        return this.categoryIconId;
    }

    public final ProgramOverviewUi copy(String title, String description, String imageURL, boolean z5, List<TagUi> tags, List<a> includedContent, List<kk.a> recommendedDevices, boolean z11, String str, boolean z12) {
        u.j(title, "title");
        u.j(description, "description");
        u.j(imageURL, "imageURL");
        u.j(tags, "tags");
        u.j(includedContent, "includedContent");
        u.j(recommendedDevices, "recommendedDevices");
        return new ProgramOverviewUi(title, description, imageURL, z5, tags, includedContent, recommendedDevices, z11, str, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramOverviewUi)) {
            return false;
        }
        ProgramOverviewUi programOverviewUi = (ProgramOverviewUi) obj;
        if (u.e(this.title, programOverviewUi.title) && u.e(this.description, programOverviewUi.description) && u.e(this.imageURL, programOverviewUi.imageURL) && this.isNew == programOverviewUi.isNew && u.e(this.tags, programOverviewUi.tags) && u.e(this.includedContent, programOverviewUi.includedContent) && u.e(this.recommendedDevices, programOverviewUi.recommendedDevices) && this.isAppCapability == programOverviewUi.isAppCapability && u.e(this.categoryIconId, programOverviewUi.categoryIconId) && this.isAccessible == programOverviewUi.isAccessible) {
            return true;
        }
        return false;
    }

    public final String getCategoryIconId() {
        return this.categoryIconId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final List<a> getIncludedContent() {
        return this.includedContent;
    }

    public final List<kk.a> getRecommendedDevices() {
        return this.recommendedDevices;
    }

    public final List<TagUi> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int a11 = y1.a(this.isAppCapability, e.b(this.recommendedDevices, e.b(this.includedContent, e.b(this.tags, y1.a(this.isNew, d.c(this.imageURL, d.c(this.description, this.title.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        String str = this.categoryIconId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.isAccessible) + ((a11 + hashCode) * 31);
    }

    public final boolean isAccessible() {
        return this.isAccessible;
    }

    public final boolean isAppCapability() {
        return this.isAppCapability;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.imageURL;
        boolean z5 = this.isNew;
        List<TagUi> list = this.tags;
        List<a> list2 = this.includedContent;
        List<kk.a> list3 = this.recommendedDevices;
        boolean z11 = this.isAppCapability;
        String str4 = this.categoryIconId;
        boolean z12 = this.isAccessible;
        StringBuilder b10 = l0.b("ProgramOverviewUi(title=", str, ", description=", str2, ", imageURL=");
        b10.append(str3);
        b10.append(", isNew=");
        b10.append(z5);
        b10.append(", tags=");
        com.withings.contentproviders.eightfit.model.webservice.a.a(b10, list, ", includedContent=", list2, ", recommendedDevices=");
        b10.append(list3);
        b10.append(", isAppCapability=");
        b10.append(z11);
        b10.append(", categoryIconId=");
        b10.append(str4);
        b10.append(", isAccessible=");
        b10.append(z12);
        b10.append(")");
        return b10.toString();
    }
}
