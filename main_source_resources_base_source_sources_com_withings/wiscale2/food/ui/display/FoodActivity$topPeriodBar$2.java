package com.withings.wiscale2.food.ui.display;

import androidx.compose.ui.platform.ComposeView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: FoodActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/platform/ComposeView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FoodActivity$topPeriodBar$2 extends w implements ym0.a<ComposeView> {
    final /* synthetic */ FoodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodActivity$topPeriodBar$2(FoodActivity foodActivity) {
        super(0);
        this.this$0 = foodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ComposeView invoke() {
        return (ComposeView) this.this$0.findViewById(C1987R.id.top_period_bar);
    }
}
