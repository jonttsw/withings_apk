package com.withings.coach.chatbot;

import android.text.Spanned;
import androidx.camera.core.y1;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f33021a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f33022b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f33023c;

    /* renamed from: d  reason: collision with root package name */
    private String f33024d;

    /* renamed from: e  reason: collision with root package name */
    private final String f33025e;

    /* renamed from: f  reason: collision with root package name */
    private final hm.d f33026f;

    /* renamed from: g  reason: collision with root package name */
    private final String f33027g;

    public l0() {
        this(null, null, null, null, null, null, 127);
    }

    public final hm.d a() {
        return this.f33026f;
    }

    public final CharSequence b() {
        return this.f33023c;
    }

    public final String c() {
        return this.f33025e;
    }

    public final String d() {
        return this.f33021a;
    }

    public final String e() {
        return this.f33024d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (kotlin.jvm.internal.u.e(this.f33021a, l0Var.f33021a) && kotlin.jvm.internal.u.e(this.f33022b, l0Var.f33022b) && kotlin.jvm.internal.u.e(this.f33023c, l0Var.f33023c) && kotlin.jvm.internal.u.e(this.f33024d, l0Var.f33024d) && kotlin.jvm.internal.u.e(this.f33025e, l0Var.f33025e) && kotlin.jvm.internal.u.e(this.f33026f, l0Var.f33026f) && kotlin.jvm.internal.u.e(this.f33027g, l0Var.f33027g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f33027g;
    }

    public final CharSequence g() {
        return this.f33022b;
    }

    public final void h(CharSequence charSequence) {
        this.f33023c = charSequence;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i11 = 0;
        String str = this.f33021a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        CharSequence charSequence = this.f33022b;
        if (charSequence == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = charSequence.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        CharSequence charSequence2 = this.f33023c;
        if (charSequence2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = charSequence2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.f33024d;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str3 = this.f33025e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        hm.d dVar = this.f33026f;
        if (dVar != null) {
            i11 = dVar.hashCode();
        }
        return this.f33027g.hashCode() + ((i16 + i11) * 31);
    }

    public final void i(String str) {
        this.f33024d = str;
    }

    public final void j(Spanned spanned) {
        this.f33022b = spanned;
    }

    public final String toString() {
        CharSequence charSequence = this.f33022b;
        CharSequence charSequence2 = this.f33023c;
        String str = this.f33024d;
        StringBuilder sb2 = new StringBuilder("ChatbotItemData(id=");
        sb2.append(this.f33021a);
        sb2.append(", title=");
        sb2.append((Object) charSequence);
        sb2.append(", description=");
        sb2.append((Object) charSequence2);
        sb2.append(", imageUrl=");
        sb2.append(str);
        sb2.append(", glyph=");
        sb2.append(this.f33025e);
        sb2.append(", deeplinkData=");
        sb2.append(this.f33026f);
        sb2.append(", messageType=");
        return y1.e(sb2, this.f33027g, ")");
    }

    public l0(String str, CharSequence charSequence, CharSequence charSequence2, String str2, hm.d dVar, String messageType, int i11) {
        str = (i11 & 1) != 0 ? null : str;
        charSequence = (i11 & 2) != 0 ? null : charSequence;
        charSequence2 = (i11 & 4) != 0 ? null : charSequence2;
        str2 = (i11 & 16) != 0 ? null : str2;
        dVar = (i11 & 32) != 0 ? null : dVar;
        messageType = (i11 & 64) != 0 ? "default_bubble" : messageType;
        kotlin.jvm.internal.u.j(messageType, "messageType");
        this.f33021a = str;
        this.f33022b = charSequence;
        this.f33023c = charSequence2;
        this.f33024d = null;
        this.f33025e = str2;
        this.f33026f = dVar;
        this.f33027g = messageType;
    }
}
