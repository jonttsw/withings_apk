package com.withings.zendesk.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material3.g9;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.zendesk.ui.vm.HelpCenterViewModel;
import java.util.List;
import k1.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import nk.a0;
import nm0.g;
import r0.d0;
import x1.b;
import yk.h;
import ym0.p;
/* compiled from: SearchFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/withings/zendesk/ui/SearchFragment;", "Landroidx/fragment/app/Fragment;", "", "query", "Lnm0/y;", "EmptyState", "(Ljava/lang/String;Landroidx/compose/runtime/a;I)V", "", "", "results", "Content", "(Ljava/util/List;Landroidx/compose/runtime/a;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel$delegate", "Lnm0/g;", "getViewModel", "()Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchFragment extends Fragment {
    public static final int $stable = 8;
    private final g viewModel$delegate = v0.a(this, q0.b(HelpCenterViewModel.class), new SearchFragment$special$$inlined$activityViewModels$default$1(this), new SearchFragment$special$$inlined$activityViewModels$default$2(null, this), new SearchFragment$special$$inlined$activityViewModels$default$3(this));

    /* JADX INFO: Access modifiers changed from: private */
    public final void Content(List<? extends Object> list, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-1355647597);
        s0.a.a(e1.d(androidx.compose.ui.e.f8927a), null, null, false, null, null, null, false, new SearchFragment$Content$1(list, this), g11, 6, ConstantsWs.WS_STATUS_NOREPOUSER);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new SearchFragment$Content$2(this, list, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EmptyState(String str, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(1351440679);
        if ((i11 & 14) == 0) {
            if (g11.K(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e d11 = e1.d(aVar2);
            g11.s(-483455358);
            l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                c11.invoke(j1.a(g11), g11, 0);
                g11.s(2058660585);
                d0.a(e1.f(aVar2, h.s()), g11);
                a0.i(0, 0, 28, 0L, g11, new HorizontalAlignElement(b.a.g()), null, ay.b.v(C1987R.string.helpCenter_searchNoResult, new Object[]{str}, g11));
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new SearchFragment$EmptyState$2(this, str, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HelpCenterViewModel getViewModel() {
        return (HelpCenterViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        Context requireContext = requireContext();
        u.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new s1.a(true, -546094796, new SearchFragment$onCreateView$1$1(this)));
        return composeView;
    }
}
