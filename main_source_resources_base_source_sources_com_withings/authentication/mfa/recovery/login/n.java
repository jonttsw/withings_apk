package com.withings.authentication.mfa.recovery.login;

import androidx.compose.ui.platform.k4;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: RecoveryCodeInput.kt */
/* loaded from: classes3.dex */
final class n extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31879a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b2.f f31880b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f31881c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k4 f31882d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CoroutineScope coroutineScope, b2.f fVar, ym0.a<y> aVar, k4 k4Var) {
        super(0);
        this.f31879a = coroutineScope;
        this.f31880b = fVar;
        this.f31881c = aVar;
        this.f31882d = k4Var;
    }

    @Override // ym0.a
    public final y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f31879a, null, null, new m(this.f31882d, null), 3, null);
        this.f31880b.n(false);
        ym0.a<y> aVar = this.f31881c;
        if (aVar != null) {
            aVar.invoke();
        }
        return y.f85009a;
    }
}
