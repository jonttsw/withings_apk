package com.withings.wiscale2.user.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreateUserActivity.kt */
/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CreateUserActivity f61822a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CreateUserActivity createUserActivity) {
        super(1);
        this.f61822a = createUserActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        CreateUserActivity.I3(this.f61822a, l5.longValue());
        return nm0.y.f85009a;
    }
}
