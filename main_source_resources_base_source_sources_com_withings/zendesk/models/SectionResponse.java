package com.withings.zendesk.models;

import androidx.activity.result.c;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SectionResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u009f\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001J\u0013\u00107\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u0006<"}, d2 = {"Lcom/withings/zendesk/models/SectionResponse;", "", "id", "", "url", "", "htmlURL", "categoryID", "position", "sorting", "createdAt", "updatedAt", "name", HealthConstants.FoodInfo.DESCRIPTION, "locale", "sourceLocale", "outdated", "", "parentSectionID", "themeTemplate", "(JLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;)V", "getCategoryID", "()J", "getCreatedAt", "()Ljava/lang/String;", "getDescription", "getHtmlURL", "getId", "getLocale", "getName", "getOutdated", "()Z", "getParentSectionID", "getPosition", "getSorting", "getSourceLocale", "getThemeTemplate", "getUpdatedAt", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "zendesk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SectionResponse {
    public static final int $stable = 0;
    @SerializedName("category_id")
    private final long categoryID;
    @SerializedName("created_at")
    private final String createdAt;
    private final String description;
    @SerializedName("html_url")
    private final String htmlURL;

    /* renamed from: id  reason: collision with root package name */
    private final long f62981id;
    private final String locale;
    private final String name;
    private final boolean outdated;
    @SerializedName("parent_section_id")
    private final long parentSectionID;
    private final long position;
    private final String sorting;
    @SerializedName("source_locale")
    private final String sourceLocale;
    private final String themeTemplate;
    @SerializedName("updated_at")
    private final String updatedAt;
    private final String url;

    public SectionResponse(long j5, String url, String htmlURL, long j11, long j12, String sorting, String createdAt, String updatedAt, String name, String description, String locale, String sourceLocale, boolean z5, long j13, String themeTemplate) {
        u.j(url, "url");
        u.j(htmlURL, "htmlURL");
        u.j(sorting, "sorting");
        u.j(createdAt, "createdAt");
        u.j(updatedAt, "updatedAt");
        u.j(name, "name");
        u.j(description, "description");
        u.j(locale, "locale");
        u.j(sourceLocale, "sourceLocale");
        u.j(themeTemplate, "themeTemplate");
        this.f62981id = j5;
        this.url = url;
        this.htmlURL = htmlURL;
        this.categoryID = j11;
        this.position = j12;
        this.sorting = sorting;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.description = description;
        this.locale = locale;
        this.sourceLocale = sourceLocale;
        this.outdated = z5;
        this.parentSectionID = j13;
        this.themeTemplate = themeTemplate;
    }

    public final long component1() {
        return this.f62981id;
    }

    public final String component10() {
        return this.description;
    }

    public final String component11() {
        return this.locale;
    }

    public final String component12() {
        return this.sourceLocale;
    }

    public final boolean component13() {
        return this.outdated;
    }

    public final long component14() {
        return this.parentSectionID;
    }

    public final String component15() {
        return this.themeTemplate;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.htmlURL;
    }

    public final long component4() {
        return this.categoryID;
    }

    public final long component5() {
        return this.position;
    }

    public final String component6() {
        return this.sorting;
    }

    public final String component7() {
        return this.createdAt;
    }

    public final String component8() {
        return this.updatedAt;
    }

    public final String component9() {
        return this.name;
    }

    public final SectionResponse copy(long j5, String url, String htmlURL, long j11, long j12, String sorting, String createdAt, String updatedAt, String name, String description, String locale, String sourceLocale, boolean z5, long j13, String themeTemplate) {
        u.j(url, "url");
        u.j(htmlURL, "htmlURL");
        u.j(sorting, "sorting");
        u.j(createdAt, "createdAt");
        u.j(updatedAt, "updatedAt");
        u.j(name, "name");
        u.j(description, "description");
        u.j(locale, "locale");
        u.j(sourceLocale, "sourceLocale");
        u.j(themeTemplate, "themeTemplate");
        return new SectionResponse(j5, url, htmlURL, j11, j12, sorting, createdAt, updatedAt, name, description, locale, sourceLocale, z5, j13, themeTemplate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionResponse)) {
            return false;
        }
        SectionResponse sectionResponse = (SectionResponse) obj;
        if (this.f62981id == sectionResponse.f62981id && u.e(this.url, sectionResponse.url) && u.e(this.htmlURL, sectionResponse.htmlURL) && this.categoryID == sectionResponse.categoryID && this.position == sectionResponse.position && u.e(this.sorting, sectionResponse.sorting) && u.e(this.createdAt, sectionResponse.createdAt) && u.e(this.updatedAt, sectionResponse.updatedAt) && u.e(this.name, sectionResponse.name) && u.e(this.description, sectionResponse.description) && u.e(this.locale, sectionResponse.locale) && u.e(this.sourceLocale, sectionResponse.sourceLocale) && this.outdated == sectionResponse.outdated && this.parentSectionID == sectionResponse.parentSectionID && u.e(this.themeTemplate, sectionResponse.themeTemplate)) {
            return true;
        }
        return false;
    }

    public final long getCategoryID() {
        return this.categoryID;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHtmlURL() {
        return this.htmlURL;
    }

    public final long getId() {
        return this.f62981id;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOutdated() {
        return this.outdated;
    }

    public final long getParentSectionID() {
        return this.parentSectionID;
    }

    public final long getPosition() {
        return this.position;
    }

    public final String getSorting() {
        return this.sorting;
    }

    public final String getSourceLocale() {
        return this.sourceLocale;
    }

    public final String getThemeTemplate() {
        return this.themeTemplate;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.themeTemplate.hashCode() + c.a(this.parentSectionID, y1.a(this.outdated, d.c(this.sourceLocale, d.c(this.locale, d.c(this.description, d.c(this.name, d.c(this.updatedAt, d.c(this.createdAt, d.c(this.sorting, c.a(this.position, c.a(this.categoryID, d.c(this.htmlURL, d.c(this.url, Long.hashCode(this.f62981id) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        long j5 = this.f62981id;
        String str = this.url;
        String str2 = this.htmlURL;
        long j11 = this.categoryID;
        long j12 = this.position;
        String str3 = this.sorting;
        String str4 = this.createdAt;
        String str5 = this.updatedAt;
        String str6 = this.name;
        String str7 = this.description;
        String str8 = this.locale;
        String str9 = this.sourceLocale;
        boolean z5 = this.outdated;
        long j13 = this.parentSectionID;
        String str10 = this.themeTemplate;
        StringBuilder sb2 = new StringBuilder("SectionResponse(id=");
        sb2.append(j5);
        sb2.append(", url=");
        sb2.append(str);
        sb2.append(", htmlURL=");
        sb2.append(str2);
        sb2.append(", categoryID=");
        sb2.append(j11);
        g.d(sb2, ", position=", j12, ", sorting=");
        b.d(sb2, str3, ", createdAt=", str4, ", updatedAt=");
        b.d(sb2, str5, ", name=", str6, ", description=");
        b.d(sb2, str7, ", locale=", str8, ", sourceLocale=");
        sb2.append(str9);
        sb2.append(", outdated=");
        sb2.append(z5);
        sb2.append(", parentSectionID=");
        sb2.append(j13);
        sb2.append(", themeTemplate=");
        sb2.append(str10);
        sb2.append(")");
        return sb2.toString();
    }
}
