package com.withings.programs.model.program;

import ii.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: DataDomain.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002¢\u0006\u0004\b2\u00103J\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0005Jp\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010\u0005R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010\bR\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b.\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b/\u0010\u000eR\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b0\u0010\u000eR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b1\u0010\u0005¨\u00064"}, d2 = {"Lcom/withings/programs/model/program/DataDomain;", "", "", "Lii/b;", "component1", "()Ljava/util/List;", "Lcom/withings/programs/model/program/CategoryDomain;", "component2", "()Lcom/withings/programs/model/program/CategoryDomain;", "Lcom/withings/programs/model/program/DurationDomain;", "component3", "()Lcom/withings/programs/model/program/DurationDomain;", "", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "Lcom/withings/programs/model/program/EventInfoDomain;", "component8", "capabilities", "category", "duration", "identifier", "subtitle", "thumbnail", "title", "infoEvent", "copy", "(Ljava/util/List;Lcom/withings/programs/model/program/CategoryDomain;Lcom/withings/programs/model/program/DurationDomain;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withings/programs/model/program/DataDomain;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCapabilities", "Lcom/withings/programs/model/program/CategoryDomain;", "getCategory", "Lcom/withings/programs/model/program/DurationDomain;", "getDuration", "Ljava/lang/String;", "getIdentifier", "getSubtitle", "getThumbnail", "getTitle", "getInfoEvent", "<init>", "(Ljava/util/List;Lcom/withings/programs/model/program/CategoryDomain;Lcom/withings/programs/model/program/DurationDomain;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DataDomain {
    private final List<b> capabilities;
    private final CategoryDomain category;
    private final DurationDomain duration;
    private final String identifier;
    private final List<EventInfoDomain> infoEvent;
    private final String subtitle;
    private final String thumbnail;
    private final String title;

    public DataDomain(List<b> list, CategoryDomain category, DurationDomain duration, String identifier, String subtitle, String thumbnail, String title, List<EventInfoDomain> list2) {
        u.j(category, "category");
        u.j(duration, "duration");
        u.j(identifier, "identifier");
        u.j(subtitle, "subtitle");
        u.j(thumbnail, "thumbnail");
        u.j(title, "title");
        this.capabilities = list;
        this.category = category;
        this.duration = duration;
        this.identifier = identifier;
        this.subtitle = subtitle;
        this.thumbnail = thumbnail;
        this.title = title;
        this.infoEvent = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataDomain copy$default(DataDomain dataDomain, List list, CategoryDomain categoryDomain, DurationDomain durationDomain, String str, String str2, String str3, String str4, List list2, int i11, Object obj) {
        List<b> list3;
        CategoryDomain categoryDomain2;
        DurationDomain durationDomain2;
        String str5;
        String str6;
        String str7;
        String str8;
        List<EventInfoDomain> list4;
        if ((i11 & 1) != 0) {
            list3 = dataDomain.capabilities;
        } else {
            list3 = list;
        }
        if ((i11 & 2) != 0) {
            categoryDomain2 = dataDomain.category;
        } else {
            categoryDomain2 = categoryDomain;
        }
        if ((i11 & 4) != 0) {
            durationDomain2 = dataDomain.duration;
        } else {
            durationDomain2 = durationDomain;
        }
        if ((i11 & 8) != 0) {
            str5 = dataDomain.identifier;
        } else {
            str5 = str;
        }
        if ((i11 & 16) != 0) {
            str6 = dataDomain.subtitle;
        } else {
            str6 = str2;
        }
        if ((i11 & 32) != 0) {
            str7 = dataDomain.thumbnail;
        } else {
            str7 = str3;
        }
        if ((i11 & 64) != 0) {
            str8 = dataDomain.title;
        } else {
            str8 = str4;
        }
        if ((i11 & 128) != 0) {
            list4 = dataDomain.infoEvent;
        } else {
            list4 = list2;
        }
        return dataDomain.copy(list3, categoryDomain2, durationDomain2, str5, str6, str7, str8, list4);
    }

    public final List<b> component1() {
        return this.capabilities;
    }

    public final CategoryDomain component2() {
        return this.category;
    }

    public final DurationDomain component3() {
        return this.duration;
    }

    public final String component4() {
        return this.identifier;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.thumbnail;
    }

    public final String component7() {
        return this.title;
    }

    public final List<EventInfoDomain> component8() {
        return this.infoEvent;
    }

    public final DataDomain copy(List<b> list, CategoryDomain category, DurationDomain duration, String identifier, String subtitle, String thumbnail, String title, List<EventInfoDomain> list2) {
        u.j(category, "category");
        u.j(duration, "duration");
        u.j(identifier, "identifier");
        u.j(subtitle, "subtitle");
        u.j(thumbnail, "thumbnail");
        u.j(title, "title");
        return new DataDomain(list, category, duration, identifier, subtitle, thumbnail, title, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataDomain)) {
            return false;
        }
        DataDomain dataDomain = (DataDomain) obj;
        if (u.e(this.capabilities, dataDomain.capabilities) && u.e(this.category, dataDomain.category) && u.e(this.duration, dataDomain.duration) && u.e(this.identifier, dataDomain.identifier) && u.e(this.subtitle, dataDomain.subtitle) && u.e(this.thumbnail, dataDomain.thumbnail) && u.e(this.title, dataDomain.title) && u.e(this.infoEvent, dataDomain.infoEvent)) {
            return true;
        }
        return false;
    }

    public final List<b> getCapabilities() {
        return this.capabilities;
    }

    public final CategoryDomain getCategory() {
        return this.category;
    }

    public final DurationDomain getDuration() {
        return this.duration;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<EventInfoDomain> getInfoEvent() {
        return this.infoEvent;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        List<b> list = this.capabilities;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode2 = this.category.hashCode();
        int c11 = d.c(this.title, d.c(this.thumbnail, d.c(this.subtitle, d.c(this.identifier, (this.duration.hashCode() + ((hashCode2 + (hashCode * 31)) * 31)) * 31, 31), 31), 31), 31);
        List<EventInfoDomain> list2 = this.infoEvent;
        if (list2 != null) {
            i11 = list2.hashCode();
        }
        return c11 + i11;
    }

    public String toString() {
        List<b> list = this.capabilities;
        CategoryDomain categoryDomain = this.category;
        DurationDomain durationDomain = this.duration;
        String str = this.identifier;
        String str2 = this.subtitle;
        String str3 = this.thumbnail;
        String str4 = this.title;
        List<EventInfoDomain> list2 = this.infoEvent;
        StringBuilder sb2 = new StringBuilder("DataDomain(capabilities=");
        sb2.append(list);
        sb2.append(", category=");
        sb2.append(categoryDomain);
        sb2.append(", duration=");
        sb2.append(durationDomain);
        sb2.append(", identifier=");
        sb2.append(str);
        sb2.append(", subtitle=");
        b.d(sb2, str2, ", thumbnail=", str3, ", title=");
        sb2.append(str4);
        sb2.append(", infoEvent=");
        sb2.append(list2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ DataDomain(List list, CategoryDomain categoryDomain, DurationDomain durationDomain, String str, String str2, String str3, String str4, List list2, int i11, m mVar) {
        this(list, categoryDomain, durationDomain, str, str2, str3, str4, (i11 & 128) != 0 ? i0.f76187a : list2);
    }
}
