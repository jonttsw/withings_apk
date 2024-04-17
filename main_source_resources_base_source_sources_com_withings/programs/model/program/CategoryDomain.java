package com.withings.programs.model.program;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: CategoryDomain.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/withings/programs/model/program/CategoryDomain;", "", "iconId", "", "identifier", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconId", "()Ljava/lang/String;", "getIdentifier", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CategoryDomain {
    private final String iconId;
    private final String identifier;
    private final String title;

    public CategoryDomain(String iconId, String identifier, String title) {
        u.j(iconId, "iconId");
        u.j(identifier, "identifier");
        u.j(title, "title");
        this.iconId = iconId;
        this.identifier = identifier;
        this.title = title;
    }

    public static /* synthetic */ CategoryDomain copy$default(CategoryDomain categoryDomain, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = categoryDomain.iconId;
        }
        if ((i11 & 2) != 0) {
            str2 = categoryDomain.identifier;
        }
        if ((i11 & 4) != 0) {
            str3 = categoryDomain.title;
        }
        return categoryDomain.copy(str, str2, str3);
    }

    public final String component1() {
        return this.iconId;
    }

    public final String component2() {
        return this.identifier;
    }

    public final String component3() {
        return this.title;
    }

    public final CategoryDomain copy(String iconId, String identifier, String title) {
        u.j(iconId, "iconId");
        u.j(identifier, "identifier");
        u.j(title, "title");
        return new CategoryDomain(iconId, identifier, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryDomain)) {
            return false;
        }
        CategoryDomain categoryDomain = (CategoryDomain) obj;
        if (u.e(this.iconId, categoryDomain.iconId) && u.e(this.identifier, categoryDomain.identifier) && u.e(this.title, categoryDomain.title)) {
            return true;
        }
        return false;
    }

    public final String getIconId() {
        return this.iconId;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + d.c(this.identifier, this.iconId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.iconId;
        String str2 = this.identifier;
        return y1.e(l0.b("CategoryDomain(iconId=", str, ", identifier=", str2, ", title="), this.title, ")");
    }
}
