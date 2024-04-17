package com.withings.zendesk.models;

import androidx.activity.result.c;
import androidx.appcompat.widget.v0;
import androidx.work.impl.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: SectionsResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003Jk\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006-"}, d2 = {"Lcom/withings/zendesk/models/SectionsResponse;", "", "sections", "", "Lcom/withings/zendesk/models/SectionResponse;", "page", "", "previousPage", "nextPage", "", "perPage", "pageCount", "count", "sortBy", "sortOrder", "(Ljava/util/List;JLjava/lang/Object;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;)V", "getCount", "()J", "getNextPage", "()Ljava/lang/String;", "getPage", "getPageCount", "getPerPage", "getPreviousPage", "()Ljava/lang/Object;", "getSections", "()Ljava/util/List;", "getSortBy", "getSortOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SectionsResponse {
    public static final int $stable = 8;
    private final long count;
    private final String nextPage;
    private final long page;
    private final long pageCount;
    private final long perPage;
    private final Object previousPage;
    private final List<SectionResponse> sections;
    private final String sortBy;
    private final String sortOrder;

    public SectionsResponse(List<SectionResponse> sections, long j5, Object obj, String nextPage, long j11, long j12, long j13, String sortBy, String sortOrder) {
        u.j(sections, "sections");
        u.j(nextPage, "nextPage");
        u.j(sortBy, "sortBy");
        u.j(sortOrder, "sortOrder");
        this.sections = sections;
        this.page = j5;
        this.previousPage = obj;
        this.nextPage = nextPage;
        this.perPage = j11;
        this.pageCount = j12;
        this.count = j13;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionsResponse copy$default(SectionsResponse sectionsResponse, List list, long j5, Object obj, String str, long j11, long j12, long j13, String str2, String str3, int i11, Object obj2) {
        List<SectionResponse> list2;
        long j14;
        Object obj3;
        String str4;
        long j15;
        long j16;
        long j17;
        String str5;
        String str6;
        if ((i11 & 1) != 0) {
            list2 = sectionsResponse.sections;
        } else {
            list2 = list;
        }
        if ((i11 & 2) != 0) {
            j14 = sectionsResponse.page;
        } else {
            j14 = j5;
        }
        if ((i11 & 4) != 0) {
            obj3 = sectionsResponse.previousPage;
        } else {
            obj3 = obj;
        }
        if ((i11 & 8) != 0) {
            str4 = sectionsResponse.nextPage;
        } else {
            str4 = str;
        }
        if ((i11 & 16) != 0) {
            j15 = sectionsResponse.perPage;
        } else {
            j15 = j11;
        }
        if ((i11 & 32) != 0) {
            j16 = sectionsResponse.pageCount;
        } else {
            j16 = j12;
        }
        if ((i11 & 64) != 0) {
            j17 = sectionsResponse.count;
        } else {
            j17 = j13;
        }
        if ((i11 & 128) != 0) {
            str5 = sectionsResponse.sortBy;
        } else {
            str5 = str2;
        }
        if ((i11 & 256) != 0) {
            str6 = sectionsResponse.sortOrder;
        } else {
            str6 = str3;
        }
        return sectionsResponse.copy(list2, j14, obj3, str4, j15, j16, j17, str5, str6);
    }

    public final List<SectionResponse> component1() {
        return this.sections;
    }

    public final long component2() {
        return this.page;
    }

    public final Object component3() {
        return this.previousPage;
    }

    public final String component4() {
        return this.nextPage;
    }

    public final long component5() {
        return this.perPage;
    }

    public final long component6() {
        return this.pageCount;
    }

    public final long component7() {
        return this.count;
    }

    public final String component8() {
        return this.sortBy;
    }

    public final String component9() {
        return this.sortOrder;
    }

    public final SectionsResponse copy(List<SectionResponse> sections, long j5, Object obj, String nextPage, long j11, long j12, long j13, String sortBy, String sortOrder) {
        u.j(sections, "sections");
        u.j(nextPage, "nextPage");
        u.j(sortBy, "sortBy");
        u.j(sortOrder, "sortOrder");
        return new SectionsResponse(sections, j5, obj, nextPage, j11, j12, j13, sortBy, sortOrder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionsResponse)) {
            return false;
        }
        SectionsResponse sectionsResponse = (SectionsResponse) obj;
        if (u.e(this.sections, sectionsResponse.sections) && this.page == sectionsResponse.page && u.e(this.previousPage, sectionsResponse.previousPage) && u.e(this.nextPage, sectionsResponse.nextPage) && this.perPage == sectionsResponse.perPage && this.pageCount == sectionsResponse.pageCount && this.count == sectionsResponse.count && u.e(this.sortBy, sectionsResponse.sortBy) && u.e(this.sortOrder, sectionsResponse.sortOrder)) {
            return true;
        }
        return false;
    }

    public final long getCount() {
        return this.count;
    }

    public final String getNextPage() {
        return this.nextPage;
    }

    public final long getPage() {
        return this.page;
    }

    public final long getPageCount() {
        return this.pageCount;
    }

    public final long getPerPage() {
        return this.perPage;
    }

    public final Object getPreviousPage() {
        return this.previousPage;
    }

    public final List<SectionResponse> getSections() {
        return this.sections;
    }

    public final String getSortBy() {
        return this.sortBy;
    }

    public final String getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        int hashCode;
        int a11 = c.a(this.page, this.sections.hashCode() * 31, 31);
        Object obj = this.previousPage;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.sortOrder.hashCode() + d.c(this.sortBy, c.a(this.count, c.a(this.pageCount, c.a(this.perPage, d.c(this.nextPage, (a11 + hashCode) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        List<SectionResponse> list = this.sections;
        long j5 = this.page;
        Object obj = this.previousPage;
        String str = this.nextPage;
        long j11 = this.perPage;
        long j12 = this.pageCount;
        long j13 = this.count;
        String str2 = this.sortBy;
        String str3 = this.sortOrder;
        StringBuilder sb2 = new StringBuilder("SectionsResponse(sections=");
        sb2.append(list);
        sb2.append(", page=");
        sb2.append(j5);
        sb2.append(", previousPage=");
        sb2.append(obj);
        sb2.append(", nextPage=");
        sb2.append(str);
        g.d(sb2, ", perPage=", j11, ", pageCount=");
        sb2.append(j12);
        g.d(sb2, ", count=", j13, ", sortBy=");
        return v0.d(sb2, str2, ", sortOrder=", str3, ")");
    }

    public /* synthetic */ SectionsResponse(List list, long j5, Object obj, String str, long j11, long j12, long j13, String str2, String str3, int i11, m mVar) {
        this(list, j5, (i11 & 4) != 0 ? null : obj, str, j11, j12, j13, str2, str3);
    }
}
