package com.withings.healthplus.contentscreens.ui.model;

import am.p;
import androidx.camera.camera2.internal.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: TagUi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "", "iconName", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getIconName", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TagUi {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String iconName;
    private final String text;

    /* compiled from: TagUi.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/TagUi$Companion;", "", "", "Lam/p;", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "toUiItems", "(Ljava/util/List;)Ljava/util/List;", "toUiItem", "(Lam/p;)Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final TagUi toUiItem(p pVar) {
            u.j(pVar, "<this>");
            String a11 = pVar.a();
            String c11 = pVar.c();
            if (c11 == null) {
                c11 = "";
            }
            return new TagUi(a11, c11);
        }

        public final List<TagUi> toUiItems(List<p> list) {
            u.j(list, "<this>");
            List<p> list2 = list;
            ArrayList arrayList = new ArrayList(x.y(list2, 10));
            for (p pVar : list2) {
                arrayList.add(TagUi.Companion.toUiItem(pVar));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public TagUi(String str, String text) {
        u.j(text, "text");
        this.iconName = str;
        this.text = text;
    }

    public static /* synthetic */ TagUi copy$default(TagUi tagUi, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tagUi.iconName;
        }
        if ((i11 & 2) != 0) {
            str2 = tagUi.text;
        }
        return tagUi.copy(str, str2);
    }

    public final String component1() {
        return this.iconName;
    }

    public final String component2() {
        return this.text;
    }

    public final TagUi copy(String str, String text) {
        u.j(text, "text");
        return new TagUi(str, text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagUi)) {
            return false;
        }
        TagUi tagUi = (TagUi) obj;
        if (u.e(this.iconName, tagUi.iconName) && u.e(this.text, tagUi.text)) {
            return true;
        }
        return false;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        String str = this.iconName;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.text.hashCode() + (hashCode * 31);
    }

    public String toString() {
        return k0.c("TagUi(iconName=", this.iconName, ", text=", this.text, ")");
    }
}
