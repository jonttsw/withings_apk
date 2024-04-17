package com.withings.wiscale2.device.common.screen.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel", f = "ScreenSelectionViewModel.kt", l = {194, 195, 211}, m = "disableRequiringScreens")
/* loaded from: classes5.dex */
public final class b2 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    ScreenSelectionViewModel f53270a;

    /* renamed from: b  reason: collision with root package name */
    List f53271b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f53272c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionViewModel f53273d;

    /* renamed from: e  reason: collision with root package name */
    int f53274e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(ScreenSelectionViewModel screenSelectionViewModel, qm0.d<? super b2> dVar) {
        super(dVar);
        this.f53273d = screenSelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f53272c = obj;
        this.f53274e |= Integer.MIN_VALUE;
        return ScreenSelectionViewModel.f0(this.f53273d, this);
    }
}
