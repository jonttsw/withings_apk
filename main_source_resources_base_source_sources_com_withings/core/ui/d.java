package com.withings.core.ui;

import java.util.Collection;
import pi.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NoteEditionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.core.ui.NoteEditionActivity", f = "NoteEditionActivity.kt", l = {82}, m = "setupWithSuggestions")
/* loaded from: classes3.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    NoteEditionActivity f35385a;

    /* renamed from: b  reason: collision with root package name */
    a.C1520a f35386b;

    /* renamed from: c  reason: collision with root package name */
    int[] f35387c;

    /* renamed from: d  reason: collision with root package name */
    Collection f35388d;

    /* renamed from: e  reason: collision with root package name */
    int f35389e;

    /* renamed from: f  reason: collision with root package name */
    int f35390f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f35391g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ NoteEditionActivity f35392h;

    /* renamed from: i  reason: collision with root package name */
    int f35393i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NoteEditionActivity noteEditionActivity, qm0.d<? super d> dVar) {
        super(dVar);
        this.f35392h = noteEditionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f35391g = obj;
        this.f35393i |= Integer.MIN_VALUE;
        return NoteEditionActivity.A3(this.f35392h, this);
    }
}
