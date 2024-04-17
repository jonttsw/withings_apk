package com.withings.wiscale2.food.ui.setup;

import androidx.navigation.e;
import b50.b;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: FoodSetupActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigation/e;", "invoke", "()Landroidx/navigation/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class FoodSetupActivity$navController$2 extends w implements ym0.a<e> {
    final /* synthetic */ FoodSetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodSetupActivity$navController$2(FoodSetupActivity foodSetupActivity) {
        super(0);
        this.this$0 = foodSetupActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final e invoke() {
        return b.d(this.this$0, C1987R.id.nav_host_fragment);
    }
}
