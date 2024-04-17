package com.withings.contentproviders.eightfit.model.content;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.firebase.messaging.Constants;
import fn0.d;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import nm0.g;
import nm0.h;
import ym0.a;
/* compiled from: EightFitContent.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0013\u0010\u0014B\u001b\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0007\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getIdentifier", "()Ljava/lang/String;", "identifier", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "getTags", "()Ljava/util/List;", "tags", "<init>", "()V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "EightFitRecommendedDevice", "EightFitRecommendedEquipment", "EightFitTag", "Lcom/withings/contentproviders/eightfit/model/content/EightFitArticleContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitDiscoveryContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitSurveyContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public abstract class EightFitContent {
    public static final Companion Companion = new Companion(null);
    private static final g<KSerializer<Object>> $cachedSerializer$delegate = h.a(LazyThreadSafetyMode.f76137b, Companion.AnonymousClass1.INSTANCE);

    /* compiled from: EightFitContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: EightFitContent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.withings.contentproviders.eightfit.model.content.EightFitContent$Companion$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        static final class AnonymousClass1 extends w implements a<KSerializer<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // ym0.a
            public final KSerializer<Object> invoke() {
                return new SealedClassSerializer("com.withings.contentproviders.eightfit.model.content.EightFitContent", q0.b(EightFitContent.class), new d[]{q0.b(EightFitArticleContent.class), q0.b(EightFitDiscoveryContent.class), q0.b(EightFitMeasurementContent.class), q0.b(EightFitObjectiveContent.class), q0.b(EightFitRecipeContent.class), q0.b(EightFitSurveyContent.class), q0.b(EightFitWorkoutContent.class)}, new KSerializer[]{EightFitArticleContent$$serializer.INSTANCE, EightFitDiscoveryContent$$serializer.INSTANCE, EightFitMeasurementContent$$serializer.INSTANCE, EightFitObjectiveContent$$serializer.INSTANCE, EightFitRecipeContent$$serializer.INSTANCE, EightFitSurveyContent$$serializer.INSTANCE, EightFitWorkoutContent$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) EightFitContent.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<EightFitContent> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* compiled from: EightFitContent.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#B3\b\u0011\u0012\u0006\u0010$\u001a\u00020\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006*"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "", "component1", "()Ljava/util/List;", "", "component2", "()Z", "models", "required", "copy", "(Ljava/util/List;Z)Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getModels", "Z", "getRequired", "<init>", "(Ljava/util/List;Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
    @Serializable
    /* loaded from: classes3.dex */
    public static final class EightFitRecommendedDevice {
        private final List<Integer> models;
        private final boolean required;
        public static final Companion Companion = new Companion(null);
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null};

        /* compiled from: EightFitContent.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final KSerializer<EightFitRecommendedDevice> serializer() {
                return EightFitContent$EightFitRecommendedDevice$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ EightFitRecommendedDevice(int i11, List list, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i11 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i11, 3, EightFitContent$EightFitRecommendedDevice$$serializer.INSTANCE.getDescriptor());
            }
            this.models = list;
            this.required = z5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EightFitRecommendedDevice copy$default(EightFitRecommendedDevice eightFitRecommendedDevice, List list, boolean z5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = eightFitRecommendedDevice.models;
            }
            if ((i11 & 2) != 0) {
                z5 = eightFitRecommendedDevice.required;
            }
            return eightFitRecommendedDevice.copy(list, z5);
        }

        public static final /* synthetic */ void write$Self$eightfit_release(EightFitRecommendedDevice eightFitRecommendedDevice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], eightFitRecommendedDevice.models);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, eightFitRecommendedDevice.required);
        }

        public final List<Integer> component1() {
            return this.models;
        }

        public final boolean component2() {
            return this.required;
        }

        public final EightFitRecommendedDevice copy(List<Integer> models, boolean z5) {
            u.j(models, "models");
            return new EightFitRecommendedDevice(models, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EightFitRecommendedDevice)) {
                return false;
            }
            EightFitRecommendedDevice eightFitRecommendedDevice = (EightFitRecommendedDevice) obj;
            if (u.e(this.models, eightFitRecommendedDevice.models) && this.required == eightFitRecommendedDevice.required) {
                return true;
            }
            return false;
        }

        public final List<Integer> getModels() {
            return this.models;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public int hashCode() {
            return Boolean.hashCode(this.required) + (this.models.hashCode() * 31);
        }

        public String toString() {
            List<Integer> list = this.models;
            boolean z5 = this.required;
            return "EightFitRecommendedDevice(models=" + list + ", required=" + z5 + ")";
        }

        public EightFitRecommendedDevice(List<Integer> models, boolean z5) {
            u.j(models, "models");
            this.models = models;
            this.required = z5;
        }
    }

    /* compiled from: EightFitContent.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$B7\b\u0011\u0012\u0006\u0010%\u001a\u00020\u0018\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b \u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006+"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedEquipment;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedEquipment;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Z", Constants.ScionAnalytics.PARAM_LABEL, "iconId", "required", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedEquipment;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getIconId", "Z", "getRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
    @Serializable
    /* loaded from: classes3.dex */
    public static final class EightFitRecommendedEquipment {
        public static final Companion Companion = new Companion(null);
        private final String iconId;
        private final String label;
        private final boolean required;

        /* compiled from: EightFitContent.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedEquipment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedEquipment;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final KSerializer<EightFitRecommendedEquipment> serializer() {
                return EightFitContent$EightFitRecommendedEquipment$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ EightFitRecommendedEquipment(int i11, String str, String str2, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i11 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i11, 7, EightFitContent$EightFitRecommendedEquipment$$serializer.INSTANCE.getDescriptor());
            }
            this.label = str;
            this.iconId = str2;
            this.required = z5;
        }

        public static /* synthetic */ EightFitRecommendedEquipment copy$default(EightFitRecommendedEquipment eightFitRecommendedEquipment, String str, String str2, boolean z5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = eightFitRecommendedEquipment.label;
            }
            if ((i11 & 2) != 0) {
                str2 = eightFitRecommendedEquipment.iconId;
            }
            if ((i11 & 4) != 0) {
                z5 = eightFitRecommendedEquipment.required;
            }
            return eightFitRecommendedEquipment.copy(str, str2, z5);
        }

        public static final /* synthetic */ void write$Self$eightfit_release(EightFitRecommendedEquipment eightFitRecommendedEquipment, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitRecommendedEquipment.label);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, eightFitRecommendedEquipment.iconId);
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, eightFitRecommendedEquipment.required);
        }

        public final String component1() {
            return this.label;
        }

        public final String component2() {
            return this.iconId;
        }

        public final boolean component3() {
            return this.required;
        }

        public final EightFitRecommendedEquipment copy(String label, String iconId, boolean z5) {
            u.j(label, "label");
            u.j(iconId, "iconId");
            return new EightFitRecommendedEquipment(label, iconId, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EightFitRecommendedEquipment)) {
                return false;
            }
            EightFitRecommendedEquipment eightFitRecommendedEquipment = (EightFitRecommendedEquipment) obj;
            if (u.e(this.label, eightFitRecommendedEquipment.label) && u.e(this.iconId, eightFitRecommendedEquipment.iconId) && this.required == eightFitRecommendedEquipment.required) {
                return true;
            }
            return false;
        }

        public final String getIconId() {
            return this.iconId;
        }

        public final String getLabel() {
            return this.label;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public int hashCode() {
            return Boolean.hashCode(this.required) + d.c(this.iconId, this.label.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.label;
            String str2 = this.iconId;
            return androidx.appcompat.app.h.d(l0.b("EightFitRecommendedEquipment(label=", str, ", iconId=", str2, ", required="), this.required, ")");
        }

        public EightFitRecommendedEquipment(String label, String iconId, boolean z5) {
            u.j(label, "label");
            u.j(iconId, "iconId");
            this.label = label;
            this.iconId = iconId;
            this.required = z5;
        }
    }

    /* compiled from: EightFitContent.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b%\u0010&B9\b\u0011\u0012\u0006\u0010'\u001a\u00020\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010 R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010 ¨\u0006-"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "component3", "title", "iconId", "identifier", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getIconId", "setIconId", "getIdentifier", "setIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
    @Serializable
    /* loaded from: classes3.dex */
    public static final class EightFitTag {
        public static final Companion Companion = new Companion(null);
        private String iconId;
        private String identifier;
        private String title;

        /* compiled from: EightFitContent.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final KSerializer<EightFitTag> serializer() {
                return EightFitContent$EightFitTag$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ EightFitTag(int i11, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i11 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i11, 7, EightFitContent$EightFitTag$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.iconId = str2;
            this.identifier = str3;
        }

        public static /* synthetic */ EightFitTag copy$default(EightFitTag eightFitTag, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = eightFitTag.title;
            }
            if ((i11 & 2) != 0) {
                str2 = eightFitTag.iconId;
            }
            if ((i11 & 4) != 0) {
                str3 = eightFitTag.identifier;
            }
            return eightFitTag.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$eightfit_release(EightFitTag eightFitTag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, eightFitTag.title);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, eightFitTag.iconId);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, eightFitTag.identifier);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.iconId;
        }

        public final String component3() {
            return this.identifier;
        }

        public final EightFitTag copy(String str, String str2, String str3) {
            return new EightFitTag(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EightFitTag)) {
                return false;
            }
            EightFitTag eightFitTag = (EightFitTag) obj;
            if (u.e(this.title, eightFitTag.title) && u.e(this.iconId, eightFitTag.iconId) && u.e(this.identifier, eightFitTag.identifier)) {
                return true;
            }
            return false;
        }

        public final String getIconId() {
            return this.iconId;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.title;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.iconId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.identifier;
            if (str3 != null) {
                i11 = str3.hashCode();
            }
            return i13 + i11;
        }

        public final void setIconId(String str) {
            this.iconId = str;
        }

        public final void setIdentifier(String str) {
            this.identifier = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            String str = this.title;
            String str2 = this.iconId;
            return y1.e(l0.b("EightFitTag(title=", str, ", iconId=", str2, ", identifier="), this.identifier, ")");
        }

        public EightFitTag(String str, String str2, String str3) {
            this.title = str;
            this.iconId = str2;
            this.identifier = str3;
        }
    }

    public /* synthetic */ EightFitContent(m mVar) {
        this();
    }

    public abstract String getIdentifier();

    public abstract List<EightFitTag> getTags();

    private EightFitContent() {
    }

    public /* synthetic */ EightFitContent(int i11, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public static final /* synthetic */ void write$Self(EightFitContent eightFitContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }
}
