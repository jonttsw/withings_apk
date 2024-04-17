package com.withings.authentication.pickerUser;

import com.withings.user.User;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: PickerUser.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<User, y> f32321a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f32322b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super User, y> lVar, User user) {
        super(0);
        this.f32321a = lVar;
        this.f32322b = user;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f32321a.invoke(this.f32322b);
        return y.f85009a;
    }
}
