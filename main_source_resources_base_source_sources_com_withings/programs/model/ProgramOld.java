package com.withings.programs.model;

import android.content.Context;
import android.text.TextUtils;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.withings.model.ImagesP4;
import com.withings.webservices.legacy.withings.model.program.WsProgram;
import dp0.h;
import dp0.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import u70.m;
import wq.a;
/* compiled from: ProgramOld.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/withings/programs/model/ProgramOld;", "Ljava/io/Serializable;", "program", "Lcom/withings/webservices/legacy/withings/model/program/WsProgram;", "(Lcom/withings/webservices/legacy/withings/model/program/WsProgram;)V", "endDate", "", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "images", "Lcom/withings/webservices/legacy/withings/model/ImagesP4;", "getImages", "()Lcom/withings/webservices/legacy/withings/model/ImagesP4;", "setImages", "(Lcom/withings/webservices/legacy/withings/model/ImagesP4;)V", "menu", "", "Lcom/withings/programs/model/ProgramOld$MenuItem;", "getMenu", "()Ljava/util/List;", "setMenu", "(Ljava/util/List;)V", "name", "getName", "setName", "MenuItem", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramOld implements Serializable {
    public static final int $stable = 8;
    private String endDate;
    private ImagesP4 images;
    private List<MenuItem> menu;
    private String name;

    /* compiled from: ProgramOld.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u000f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/withings/programs/model/ProgramOld$MenuItem;", "Ljava/io/Serializable;", "()V", "menuItem", "Lcom/withings/webservices/legacy/withings/model/program/WsProgram$WsMenuItem;", "(Lcom/withings/webservices/legacy/withings/model/program/WsProgram$WsMenuItem;)V", "tradKey", "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "findModifiedKeyTitle", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "formattedTitle", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MenuItem implements Serializable {
        public static final int $stable = 8;
        private String tradKey;
        private String url;

        public MenuItem() {
        }

        private final String findModifiedKeyTitle(Context context) {
            String str = this.tradKey;
            if (str == null) {
                return null;
            }
            if (!j.R(str, "__", false) && !j.u(str, "__", false)) {
                return null;
            }
            return a.i(context, str);
        }

        public final String formattedTitle(Context context) {
            String str;
            Collection collection;
            u.j(context, "context");
            String findModifiedKeyTitle = findModifiedKeyTitle(context);
            if (findModifiedKeyTitle != null && findModifiedKeyTitle.length() != 0) {
                return findModifiedKeyTitle;
            }
            String str2 = this.tradKey;
            if (str2 != null) {
                List e11 = new h(" ").e(0, j.O(j.O(str2, "__", "", false), "_", " ", false));
                if (!e11.isEmpty()) {
                    ListIterator listIterator = e11.listIterator(e11.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collection = x.H0(e11, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = i0.f76187a;
                String[] strArr = (String[]) collection.toArray(new String[0]);
                int length = strArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    String a11 = m.a(strArr[i11]);
                    u.i(a11, "asUpperCaseFirstChar(...)");
                    strArr[i11] = a11;
                }
                str = TextUtils.join(" ", strArr);
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }

        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(String str) {
            this.url = str;
        }

        public MenuItem(WsProgram.WsMenuItem menuItem) {
            u.j(menuItem, "menuItem");
            this.tradKey = menuItem.tradKey;
            this.url = menuItem.url;
        }
    }

    public ProgramOld(WsProgram program) {
        u.j(program, "program");
        String name = program.name;
        u.i(name, "name");
        this.name = name;
        this.endDate = program.endDate;
        List<WsProgram.WsMenuItem> menu = program.menu;
        u.i(menu, "menu");
        List<WsProgram.WsMenuItem> list = menu;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (WsProgram.WsMenuItem wsMenuItem : list) {
            arrayList.add(new MenuItem(wsMenuItem));
        }
        this.menu = arrayList;
        this.images = program.images;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final ImagesP4 getImages() {
        return this.images;
    }

    public final List<MenuItem> getMenu() {
        return this.menu;
    }

    public final String getName() {
        return this.name;
    }

    public final void setEndDate(String str) {
        this.endDate = str;
    }

    public final void setImages(ImagesP4 imagesP4) {
        this.images = imagesP4;
    }

    public final void setMenu(List<MenuItem> list) {
        this.menu = list;
    }

    public final void setName(String str) {
        u.j(str, "<set-?>");
        this.name = str;
    }
}
