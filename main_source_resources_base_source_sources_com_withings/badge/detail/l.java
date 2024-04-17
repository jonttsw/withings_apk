package com.withings.badge.detail;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BadgeDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.badge.detail.BadgeDetailViewModel", f = "BadgeDetailViewModel.kt", l = {57}, m = "onBadgeLoaded")
/* loaded from: classes3.dex */
public final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    BadgeDetailViewModel f32779a;

    /* renamed from: b  reason: collision with root package name */
    ai.a f32780b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f32781c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BadgeDetailViewModel f32782d;

    /* renamed from: e  reason: collision with root package name */
    int f32783e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(BadgeDetailViewModel badgeDetailViewModel, qm0.d<? super l> dVar) {
        super(dVar);
        this.f32782d = badgeDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f32781c = obj;
        this.f32783e |= Integer.MIN_VALUE;
        return BadgeDetailViewModel.f0(this.f32782d, null, this);
    }
}
