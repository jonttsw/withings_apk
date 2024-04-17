package com.withings.wiscale2.legacyprograms;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: BrowseProgramActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/legacyprograms/BrowseProgramViewModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class BrowseProgramActivity$viewModel$2 extends w implements ym0.a<BrowseProgramViewModel> {
    final /* synthetic */ BrowseProgramActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseProgramActivity$viewModel$2(BrowseProgramActivity browseProgramActivity) {
        super(0);
        this.this$0 = browseProgramActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final BrowseProgramViewModel invoke() {
        final BrowseProgramActivity browseProgramActivity = this.this$0;
        return (BrowseProgramViewModel) new k1(browseProgramActivity, new k1.b() { // from class: com.withings.wiscale2.legacyprograms.BrowseProgramActivity$viewModel$2$invoke$$inlined$getViewModel$1
            @Override // androidx.lifecycle.k1.b
            public /* bridge */ /* synthetic */ g1 create(Class cls, i6.a aVar) {
                return super.create(cls, aVar);
            }

            @Override // androidx.lifecycle.k1.b
            public <U extends g1> U create(Class<U> modelClass) {
                u.j(modelClass, "modelClass");
                BrowseProgramViewModel create = BrowseProgramActivity.this.getBrowseProgramViewModelFactory().create(BrowseProgramActivity.this.getUser());
                u.h(create, "null cannot be cast to non-null type U of com.withings.lifecycle.ExtensionsKt.getViewModel.<no name provided>.create");
                return create;
            }
        }).a(BrowseProgramViewModel.class);
    }
}
