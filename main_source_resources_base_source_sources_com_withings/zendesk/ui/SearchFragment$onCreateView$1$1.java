package com.withings.zendesk.ui;

import com.withings.zendesk.ui.vm.HelpCenterViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: SearchFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class SearchFragment$onCreateView$1$1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ SearchFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.zendesk.ui.SearchFragment$onCreateView$1$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
        final /* synthetic */ SearchFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SearchFragment searchFragment) {
            super(2);
            this.this$0 = searchFragment;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(androidx.compose.runtime.a aVar, int i11) {
            HelpCenterViewModel viewModel;
            if ((i11 & 11) != 2 || !aVar.h()) {
                viewModel = this.this$0.getViewModel();
                j jVar = (j) t1.d.a(viewModel.getSearchResult(), aVar).getValue();
                if (jVar == null) {
                    return;
                }
                SearchFragment searchFragment = this.this$0;
                String str = (String) jVar.a();
                List list = (List) jVar.b();
                if (str.length() > 0 && list.isEmpty()) {
                    aVar.s(2089777059);
                    searchFragment.EmptyState(str, aVar, 64);
                    aVar.J();
                    return;
                }
                aVar.s(2089777113);
                searchFragment.Content(list, aVar, 72);
                aVar.J();
                return;
            }
            aVar.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$onCreateView$1$1(SearchFragment searchFragment) {
        super(2);
        this.this$0 = searchFragment;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            o.b(false, s1.b.b(aVar, -1994065586, new AnonymousClass1(this.this$0)), aVar, 48, 1);
        }
    }
}
