package com.withings.zendesk.ui;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: FragmentViewModelLazy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/g1;", "VM", "Landroidx/lifecycle/m1;", "invoke", "()Landroidx/lifecycle/m1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SectionArticlesPage$special$$inlined$activityViewModels$default$1 extends w implements ym0.a<m1> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionArticlesPage$special$$inlined$activityViewModels$default$1(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final m1 invoke() {
        m1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
        u.i(viewModelStore, "requireActivity().viewModelStore");
        return viewModelStore;
    }
}
