package com.withings.webradio;

import android.content.Context;
import com.withings.webradio.GetTreesHelper;
import com.withings.webradio.model.WebRadioNode;
import com.withings.webradio.network.GetWebRadioTree;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetTreesHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.webradio.GetTreesHelper$getTrees$1", f = "GetTreesHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetTreesHelper$getTrees$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ GetTreesHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTreesHelper$getTrees$1(GetTreesHelper getTreesHelper, Context context, d<? super GetTreesHelper$getTrees$1> dVar) {
        super(2, dVar);
        this.this$0 = getTreesHelper;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetTreesHelper$getTrees$1(this.this$0, this.$context, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        WebRadiosRemoteRepository webRadiosRemoteRepository;
        List list2;
        WebRadiosRemoteRepository webRadiosRemoteRepository2;
        List list3;
        WebRadiosRemoteRepository webRadiosRemoteRepository3;
        List<GetTreeHolder> list4;
        Object a11;
        GetTreesHelper.Callback callback;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            list = this.this$0.getTreeHolders;
            GetWebRadioTree.WebRadioTreeType webRadioTreeType = GetWebRadioTree.WebRadioTreeType.Genres;
            webRadiosRemoteRepository = this.this$0.remoteRepository;
            list.add(new GetTreeHolder(webRadioTreeType, webRadiosRemoteRepository));
            list2 = this.this$0.getTreeHolders;
            GetWebRadioTree.WebRadioTreeType webRadioTreeType2 = GetWebRadioTree.WebRadioTreeType.Places;
            webRadiosRemoteRepository2 = this.this$0.remoteRepository;
            list2.add(new GetTreeHolder(webRadioTreeType2, webRadiosRemoteRepository2));
            list3 = this.this$0.getTreeHolders;
            GetWebRadioTree.WebRadioTreeType webRadioTreeType3 = GetWebRadioTree.WebRadioTreeType.Language;
            webRadiosRemoteRepository3 = this.this$0.remoteRepository;
            list3.add(new GetTreeHolder(webRadioTreeType3, webRadiosRemoteRepository3));
            list4 = this.this$0.getTreeHolders;
            Context context = this.$context;
            GetTreesHelper getTreesHelper = this.this$0;
            for (GetTreeHolder getTreeHolder : list4) {
                try {
                    WebRadioNode call = getTreeHolder.getGetTree().call();
                    if (getTreeHolder.getGetTree().getWebRadioTreeType() == GetWebRadioTree.WebRadioTreeType.Genres) {
                        String string = context.getString(C1987R.string._WEBRADIOS_CATEGORY_GENRES_);
                        u.i(string, "getString(...)");
                        call.setTitle(string);
                    }
                    getTreeHolder.setWebRadioNode(call);
                    a11 = y.f85009a;
                } catch (Throwable th2) {
                    a11 = l.a(th2);
                }
                if (!(a11 instanceof k.a)) {
                    y yVar = (y) a11;
                    getTreesHelper.onTreeReceived();
                }
                if (k.b(a11) != null && (callback = getTreesHelper.getCallback()) != null) {
                    callback.onFailedToGetTrees(getTreesHelper);
                }
            }
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((GetTreesHelper$getTrees$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
