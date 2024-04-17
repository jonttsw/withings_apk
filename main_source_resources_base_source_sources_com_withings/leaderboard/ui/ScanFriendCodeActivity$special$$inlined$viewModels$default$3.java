package com.withings.leaderboard.ui;

import androidx.activity.ComponentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: ActivityViewModelLazy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/g1;", "VM", "Li6/a;", "invoke", "()Li6/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ScanFriendCodeActivity$special$$inlined$viewModels$default$3 extends w implements a<i6.a> {
    final /* synthetic */ a $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanFriendCodeActivity$special$$inlined$viewModels$default$3(a aVar, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final i6.a invoke() {
        i6.a aVar;
        a aVar2 = this.$extrasProducer;
        return (aVar2 == null || (aVar = (i6.a) aVar2.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : aVar;
    }
}
