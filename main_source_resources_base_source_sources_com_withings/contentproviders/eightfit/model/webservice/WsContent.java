package com.withings.contentproviders.eightfit.model.webservice;

import com.withings.contentproviders.eightfit.model.content.EightFitContent;
import fn0.d;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nm0.g;
import nm0.h;
/* compiled from: WsContent.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0004¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "toEightFit", "()Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "<init>", "()V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "Lcom/withings/contentproviders/eightfit/model/webservice/WsArticleContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsDiscoveryContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public abstract class WsContent {
    public static final Companion Companion = new Companion(null);
    private static final g<KSerializer<Object>> $cachedSerializer$delegate = h.a(LazyThreadSafetyMode.f76137b, Companion.AnonymousClass1.INSTANCE);

    /* compiled from: WsContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: WsContent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.withings.contentproviders.eightfit.model.webservice.WsContent$Companion$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        static final class AnonymousClass1 extends w implements ym0.a<KSerializer<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // ym0.a
            public final KSerializer<Object> invoke() {
                return new SealedClassSerializer("com.withings.contentproviders.eightfit.model.webservice.WsContent", q0.b(WsContent.class), new d[]{q0.b(WsArticleContent.class), q0.b(WsDiscoveryContent.class), q0.b(WsMeasurementContent.class), q0.b(WsObjectiveContent.class), q0.b(WsRecipeContent.class), q0.b(WsSurveyContent.class), q0.b(WsWorkoutContent.class)}, new KSerializer[]{WsArticleContent$$serializer.INSTANCE, WsDiscoveryContent$$serializer.INSTANCE, WsMeasurementContent$$serializer.INSTANCE, WsObjectiveContent$$serializer.INSTANCE, WsRecipeContent$$serializer.INSTANCE, WsSurveyContent$$serializer.INSTANCE, WsWorkoutContent$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) WsContent.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<WsContent> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsContent(m mVar) {
        this();
    }

    public abstract EightFitContent toEightFit();

    private WsContent() {
    }

    public /* synthetic */ WsContent(int i11, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public static final /* synthetic */ void write$Self(WsContent wsContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }
}
