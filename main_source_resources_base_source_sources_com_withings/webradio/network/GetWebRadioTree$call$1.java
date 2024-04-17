package com.withings.webradio.network;

import com.withings.webradio.model.WebRadioNode;
import com.withings.webradio.network.GetWebRadioTree;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetWebRadioTree.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/webradio/model/WebRadioNode;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.webradio.network.GetWebRadioTree$call$1", f = "GetWebRadioTree.kt", l = {27, 28}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetWebRadioTree$call$1 extends i implements p<CoroutineScope, d<? super WebRadioNode>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GetWebRadioTree this$0;

    /* compiled from: GetWebRadioTree.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetWebRadioTree.WebRadioTreeType.values().length];
            try {
                iArr[GetWebRadioTree.WebRadioTreeType.Genres.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetWebRadioTree.WebRadioTreeType.Places.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetWebRadioTree.WebRadioTreeType.Language.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWebRadioTree$call$1(GetWebRadioTree getWebRadioTree, d<? super GetWebRadioTree$call$1> dVar) {
        super(2, dVar);
        this.this$0 = getWebRadioTree;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        GetWebRadioTree$call$1 getWebRadioTree$call$1 = new GetWebRadioTree$call$1(this.this$0, dVar);
        getWebRadioTree$call$1.L$0 = obj;
        return getWebRadioTree$call$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[LOOP:0: B:19:0x0082->B:21:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc A[LOOP:1: B:29:0x00c6->B:31:0x00cc, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r10.label
            r2 = 10
            java.lang.String r3 = "list"
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            nm0.l.b(r11)
            goto L6c
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            nm0.l.b(r11)
            goto Lb0
        L21:
            nm0.l.b(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            com.withings.webradio.WebRadios r1 = com.withings.webradio.WebRadios.INSTANCE
            java.lang.String r1 = r1.getAirableBaseUrl()
            com.withings.webradio.network.GetWebRadioTree r6 = r10.this$0
            com.withings.webradio.network.GetWebRadioTree$WebRadioTreeType r6 = r6.getWebRadioTreeType()
            java.lang.String r6 = r6.getUrl()
            java.lang.String r1 = androidx.compose.material.g6.i(r1, r6)
            java.lang.String r6 = "Calling Airable with parameters : "
            java.lang.String r6 = androidx.activity.a0.b(r6, r1)
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            x70.b.r(r11, r6, r7)
            com.withings.webradio.network.GetWebRadioTree r11 = r10.this$0
            com.withings.webradio.network.GetWebRadioTree$WebRadioTreeType r11 = r11.getWebRadioTreeType()
            int[] r6 = com.withings.webradio.network.GetWebRadioTree$call$1.WhenMappings.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r6[r11]
            if (r11 == r5) goto La1
            if (r11 == r4) goto La1
            r5 = 3
            if (r11 != r5) goto L9b
            com.withings.webradio.network.GetWebRadioTree r11 = r10.this$0
            com.withings.webradio.network.WebRadiosRemoteRepository r11 = com.withings.webradio.network.GetWebRadioTree.access$getRemoteRepository$p(r11)
            r10.label = r4
            java.lang.Object r11 = r11.getAirableSubCategory(r1, r10)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategoryList r11 = (com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategoryList) r11
            java.util.List<com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategory> r11 = r11.list
            kotlin.jvm.internal.u.i(r11, r3)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.x.y(r11, r2)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L82:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r11.next()
            com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategory r1 = (com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategory) r1
            kotlin.jvm.internal.u.g(r1)
            com.withings.webradio.model.WebRadioNode r1 = com.withings.webradio.model.WebRadioNodeKt.toWebRadioNode(r1)
            r0.add(r1)
            goto L82
        L99:
            r7 = r0
            goto Ldd
        L9b:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        La1:
            com.withings.webradio.network.GetWebRadioTree r11 = r10.this$0
            com.withings.webradio.network.WebRadiosRemoteRepository r11 = com.withings.webradio.network.GetWebRadioTree.access$getRemoteRepository$p(r11)
            r10.label = r5
            java.lang.Object r11 = r11.getAirableTree(r1, r10)
            if (r11 != r0) goto Lb0
            return r0
        Lb0:
            com.withings.webservices.legacy.withings.model.airable.WsAirableTree r11 = (com.withings.webservices.legacy.withings.model.airable.WsAirableTree) r11
            java.util.List<com.withings.webservices.legacy.withings.model.airable.WsAirableNode> r11 = r11.list
            kotlin.jvm.internal.u.i(r11, r3)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.x.y(r11, r2)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        Lc6:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r11.next()
            com.withings.webservices.legacy.withings.model.airable.WsAirableNode r1 = (com.withings.webservices.legacy.withings.model.airable.WsAirableNode) r1
            kotlin.jvm.internal.u.g(r1)
            com.withings.webradio.model.WebRadioNode r1 = com.withings.webradio.model.WebRadioNodeKt.toWebRadioNode(r1)
            r0.add(r1)
            goto Lc6
        Ldd:
            com.withings.webradio.model.WebRadioNode r11 = new com.withings.webradio.model.WebRadioNode
            r8 = 4
            r9 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.webradio.network.GetWebRadioTree$call$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super WebRadioNode> dVar) {
        return ((GetWebRadioTree$call$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
