package com.withings.zendesk.ui.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import qm0.d;
import ym0.l;
import ym0.p;
import zendesk.support.Article;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Landroidx/lifecycle/LiveData;", "Lzendesk/support/Article;", "invoke", "(Ljava/lang/Long;)Landroidx/lifecycle/LiveData;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterViewModel$article$1 extends w implements l<Long, LiveData<Article>> {
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HelpCenterViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h0;", "Lzendesk/support/Article;", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.zendesk.ui.vm.HelpCenterViewModel$article$1$1", f = "HelpCenterViewModel.kt", l = {62, 62}, m = "invokeSuspend")
    /* renamed from: com.withings.zendesk.ui.vm.HelpCenterViewModel$article$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends i implements p<h0<Article>, d<? super y>, Object> {
        final /* synthetic */ Long $it;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HelpCenterViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HelpCenterViewModel helpCenterViewModel, Long l5, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = helpCenterViewModel;
            this.$it = l5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$it, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ym0.p
        public final Object invoke(h0<Article> h0Var, d<? super y> dVar) {
            return ((AnonymousClass1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                nm0.l.b(r7)
                goto L56
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                java.lang.Object r1 = r6.L$0
                androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
                nm0.l.b(r7)
                goto L46
            L20:
                nm0.l.b(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
                com.withings.zendesk.ui.vm.HelpCenterViewModel r7 = r6.this$0
                zendesk.support.HelpCenterProvider r7 = com.withings.zendesk.ui.vm.HelpCenterViewModel.access$getHelpCenterProvider$p(r7)
                if (r7 == 0) goto L56
                java.lang.Long r4 = r6.$it
                java.lang.String r5 = "$it"
                kotlin.jvm.internal.u.i(r4, r5)
                long r4 = r4.longValue()
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = com.withings.zendesk.ktx.HelpCenterProviderExtensionKt.getArticleById(r7, r4, r6)
                if (r7 != r0) goto L46
                return r0
            L46:
                zendesk.support.Article r7 = (zendesk.support.Article) r7
                if (r7 == 0) goto L56
                r3 = 0
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L56
                return r0
            L56:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.zendesk.ui.vm.HelpCenterViewModel$article$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterViewModel$article$1(HelpCenterViewModel helpCenterViewModel) {
        super(1);
        this.this$0 = helpCenterViewModel;
    }

    @Override // ym0.l
    public final LiveData<Article> invoke(Long l5) {
        return h.a(Dispatchers.getIO(), new AnonymousClass1(this.this$0, l5, null), 2);
    }
}
