package com.withings.zendesk.ui;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: FragmentViewModelLazy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/g1;", "VM", "Li6/a;", "invoke", "()Li6/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchFragment$special$$inlined$activityViewModels$default$2 extends w implements ym0.a<i6.a> {
    final /* synthetic */ ym0.a $extrasProducer;
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$special$$inlined$activityViewModels$default$2(ym0.a aVar, Fragment fragment) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final i6.a invoke() {
        i6.a aVar;
        ym0.a aVar2 = this.$extrasProducer;
        if (aVar2 == null || (aVar = (i6.a) aVar2.invoke()) == null) {
            i6.a defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            u.i(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
        return aVar;
    }
}
