package com.withings.coach.chatbot;

import nm0.k;
/* compiled from: UserResponseFormatController.kt */
/* loaded from: classes3.dex */
public final class l1 implements u0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f33028a;

    public l1(String value) {
        kotlin.jvm.internal.u.j(value, "value");
        this.f33028a = value;
    }

    @Override // com.withings.coach.chatbot.u0
    public final String a() {
        return "";
    }

    @Override // com.withings.coach.chatbot.u0
    public final boolean b(String inputValue) {
        kotlin.jvm.internal.u.j(inputValue, "inputValue");
        return true;
    }

    public final Integer c() {
        Object a11;
        try {
            a11 = Integer.valueOf(((String) dp0.j.o(this.f33028a, new String[]{"."}).get(1)).length());
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            x70.b.t(this, b10.getMessage(), b10);
        }
        if (a11 instanceof k.a) {
            a11 = null;
        }
        return (Integer) a11;
    }
}
