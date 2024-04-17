package com.withings.programs.model.enrolledprogram;

import androidx.camera.camera2.internal.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/programs/model/enrolledprogram/Menu;", "", "title", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Menu {
    private final String title;
    private final String url;

    public Menu(String title, String url) {
        u.j(title, "title");
        u.j(url, "url");
        this.title = title;
        this.url = url;
    }

    public static /* synthetic */ Menu copy$default(Menu menu, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = menu.title;
        }
        if ((i11 & 2) != 0) {
            str2 = menu.url;
        }
        return menu.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.url;
    }

    public final Menu copy(String title, String url) {
        u.j(title, "title");
        u.j(url, "url");
        return new Menu(title, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Menu)) {
            return false;
        }
        Menu menu = (Menu) obj;
        if (u.e(this.title, menu.title) && u.e(this.url, menu.url)) {
            return true;
        }
        return false;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return k0.c("Menu(title=", this.title, ", url=", this.url, ")");
    }
}
