package com.withings.contentproviders.eightfit.model.content;

import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.l0;
import com.google.firebase.messaging.Constants;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.contentproviders.eightfit.model.content.EightFitContent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: EightFitRecipeContent.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>Ba\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e¢\u0006\u0004\b8\u00109B\u0083\u0001\b\u0011\u0012\u0006\u0010:\u001a\u00020&\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000e\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b8\u0010=J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011Jz\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010\rJ\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u001b\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u0010\rR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\b1\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b2\u0010\rR\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b3\u0010\rR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b4\u0010\rR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0006¢\u0006\f\n\u0004\b \u00100\u001a\u0004\b5\u0010\u0011R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e8\u0006¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b6\u0010\u0011R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8\u0006¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b7\u0010\u0011¨\u0006@"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue;", "component6", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeIngredient;", "component7", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeInstruction;", "component8", "identifier", "tags", "title", "featureImage", HealthConstants.FoodInfo.DESCRIPTION, "nutritionalValue", "ingredients", "instructions", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "Ljava/util/List;", "getTags", "getTitle", "getFeatureImage", "getDescription", "getNutritionalValue", "getIngredients", "getInstructions", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class EightFitRecipeContent extends EightFitContent {
    private final String description;
    private final String featureImage;
    private final String identifier;
    private final List<Companion.EightFitRecipeIngredient> ingredients;
    private final List<Companion.EightFitRecipeInstruction> instructions;
    private final List<Companion.EightFitRecipeNutritionalValue> nutritionalValue;
    private final List<EightFitContent.EightFitTag> tags;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EightFitContent$EightFitTag$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue$$serializer.INSTANCE), new ArrayListSerializer(EightFitRecipeContent$Companion$EightFitRecipeIngredient$$serializer.INSTANCE), new ArrayListSerializer(EightFitRecipeContent$Companion$EightFitRecipeInstruction$$serializer.INSTANCE)};

    /* compiled from: EightFitRecipeContent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\n"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;", "EightFitRecipeIngredient", "EightFitRecipeInstruction", "EightFitRecipeNutritionalValue", "EightFitRecipeNutritionalValueChildren", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: EightFitRecipeContent.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001e\u0010\u001fB/\b\u0011\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001d\u0010\r¨\u0006&"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeIngredient;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeIngredient;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "name", "replacement", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeIngredient;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getReplacement", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
        @Serializable
        /* loaded from: classes3.dex */
        public static final class EightFitRecipeIngredient {
            public static final C0462Companion Companion = new C0462Companion(null);
            private final String name;
            private final String replacement;

            /* compiled from: EightFitRecipeContent.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeIngredient$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeIngredient;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent$Companion$EightFitRecipeIngredient$Companion  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0462Companion {
                public /* synthetic */ C0462Companion(m mVar) {
                    this();
                }

                public final KSerializer<EightFitRecipeIngredient> serializer() {
                    return EightFitRecipeContent$Companion$EightFitRecipeIngredient$$serializer.INSTANCE;
                }

                private C0462Companion() {
                }
            }

            public /* synthetic */ EightFitRecipeIngredient(int i11, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i11 & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 3, EightFitRecipeContent$Companion$EightFitRecipeIngredient$$serializer.INSTANCE.getDescriptor());
                }
                this.name = str;
                this.replacement = str2;
            }

            public static /* synthetic */ EightFitRecipeIngredient copy$default(EightFitRecipeIngredient eightFitRecipeIngredient, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = eightFitRecipeIngredient.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = eightFitRecipeIngredient.replacement;
                }
                return eightFitRecipeIngredient.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$eightfit_release(EightFitRecipeIngredient eightFitRecipeIngredient, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitRecipeIngredient.name);
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eightFitRecipeIngredient.replacement);
            }

            public final String component1() {
                return this.name;
            }

            public final String component2() {
                return this.replacement;
            }

            public final EightFitRecipeIngredient copy(String name, String str) {
                u.j(name, "name");
                return new EightFitRecipeIngredient(name, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EightFitRecipeIngredient)) {
                    return false;
                }
                EightFitRecipeIngredient eightFitRecipeIngredient = (EightFitRecipeIngredient) obj;
                if (u.e(this.name, eightFitRecipeIngredient.name) && u.e(this.replacement, eightFitRecipeIngredient.replacement)) {
                    return true;
                }
                return false;
            }

            public final String getName() {
                return this.name;
            }

            public final String getReplacement() {
                return this.replacement;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.name.hashCode() * 31;
                String str = this.replacement;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return k0.c("EightFitRecipeIngredient(name=", this.name, ", replacement=", this.replacement, ")");
            }

            public EightFitRecipeIngredient(String name, String str) {
                u.j(name, "name");
                this.name = name;
                this.replacement = str;
            }
        }

        /* compiled from: EightFitRecipeContent.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB/\b\u0011\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001d\u0010\r¨\u0006&"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeInstruction;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeInstruction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "title", "text", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeInstruction;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
        @Serializable
        /* loaded from: classes3.dex */
        public static final class EightFitRecipeInstruction {
            public static final C0463Companion Companion = new C0463Companion(null);
            private final String text;
            private final String title;

            /* compiled from: EightFitRecipeContent.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeInstruction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeInstruction;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent$Companion$EightFitRecipeInstruction$Companion  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0463Companion {
                public /* synthetic */ C0463Companion(m mVar) {
                    this();
                }

                public final KSerializer<EightFitRecipeInstruction> serializer() {
                    return EightFitRecipeContent$Companion$EightFitRecipeInstruction$$serializer.INSTANCE;
                }

                private C0463Companion() {
                }
            }

            public /* synthetic */ EightFitRecipeInstruction(int i11, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i11 & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 3, EightFitRecipeContent$Companion$EightFitRecipeInstruction$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                this.text = str2;
            }

            public static /* synthetic */ EightFitRecipeInstruction copy$default(EightFitRecipeInstruction eightFitRecipeInstruction, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = eightFitRecipeInstruction.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = eightFitRecipeInstruction.text;
                }
                return eightFitRecipeInstruction.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$eightfit_release(EightFitRecipeInstruction eightFitRecipeInstruction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitRecipeInstruction.title);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, eightFitRecipeInstruction.text);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.text;
            }

            public final EightFitRecipeInstruction copy(String title, String text) {
                u.j(title, "title");
                u.j(text, "text");
                return new EightFitRecipeInstruction(title, text);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EightFitRecipeInstruction)) {
                    return false;
                }
                EightFitRecipeInstruction eightFitRecipeInstruction = (EightFitRecipeInstruction) obj;
                if (u.e(this.title, eightFitRecipeInstruction.title) && u.e(this.text, eightFitRecipeInstruction.text)) {
                    return true;
                }
                return false;
            }

            public final String getText() {
                return this.text;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.text.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return k0.c("EightFitRecipeInstruction(title=", this.title, ", text=", this.text, ")");
            }

            public EightFitRecipeInstruction(String title, String text) {
                u.j(title, "title");
                u.j(text, "text");
                this.title = title;
                this.text = text;
            }
        }

        /* compiled from: EightFitRecipeContent.kt */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b%\u0010&B?\b\u0011\u0012\u0006\u0010'\u001a\u00020\u0019\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\"\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006-"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren;", "component3", "()Ljava/util/List;", Constants.ScionAnalytics.PARAM_LABEL, "value", "children", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getValue", "Ljava/util/List;", "getChildren", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
        @Serializable
        /* loaded from: classes3.dex */
        public static final class EightFitRecipeNutritionalValue {
            private final List<EightFitRecipeNutritionalValueChildren> children;
            private final String label;
            private final String value;
            public static final C0464Companion Companion = new C0464Companion(null);
            private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren$$serializer.INSTANCE)};

            /* compiled from: EightFitRecipeContent.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue$Companion  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0464Companion {
                public /* synthetic */ C0464Companion(m mVar) {
                    this();
                }

                public final KSerializer<EightFitRecipeNutritionalValue> serializer() {
                    return EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue$$serializer.INSTANCE;
                }

                private C0464Companion() {
                }
            }

            public /* synthetic */ EightFitRecipeNutritionalValue(int i11, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i11 & 7)) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 7, EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue$$serializer.INSTANCE.getDescriptor());
                }
                this.label = str;
                this.value = str2;
                this.children = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ EightFitRecipeNutritionalValue copy$default(EightFitRecipeNutritionalValue eightFitRecipeNutritionalValue, String str, String str2, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = eightFitRecipeNutritionalValue.label;
                }
                if ((i11 & 2) != 0) {
                    str2 = eightFitRecipeNutritionalValue.value;
                }
                if ((i11 & 4) != 0) {
                    list = eightFitRecipeNutritionalValue.children;
                }
                return eightFitRecipeNutritionalValue.copy(str, str2, list);
            }

            public static final /* synthetic */ void write$Self$eightfit_release(EightFitRecipeNutritionalValue eightFitRecipeNutritionalValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitRecipeNutritionalValue.label);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, eightFitRecipeNutritionalValue.value);
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], eightFitRecipeNutritionalValue.children);
            }

            public final String component1() {
                return this.label;
            }

            public final String component2() {
                return this.value;
            }

            public final List<EightFitRecipeNutritionalValueChildren> component3() {
                return this.children;
            }

            public final EightFitRecipeNutritionalValue copy(String label, String value, List<EightFitRecipeNutritionalValueChildren> list) {
                u.j(label, "label");
                u.j(value, "value");
                return new EightFitRecipeNutritionalValue(label, value, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EightFitRecipeNutritionalValue)) {
                    return false;
                }
                EightFitRecipeNutritionalValue eightFitRecipeNutritionalValue = (EightFitRecipeNutritionalValue) obj;
                if (u.e(this.label, eightFitRecipeNutritionalValue.label) && u.e(this.value, eightFitRecipeNutritionalValue.value) && u.e(this.children, eightFitRecipeNutritionalValue.children)) {
                    return true;
                }
                return false;
            }

            public final List<EightFitRecipeNutritionalValueChildren> getChildren() {
                return this.children;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int hashCode;
                int c11 = d.c(this.value, this.label.hashCode() * 31, 31);
                List<EightFitRecipeNutritionalValueChildren> list = this.children;
                if (list == null) {
                    hashCode = 0;
                } else {
                    hashCode = list.hashCode();
                }
                return c11 + hashCode;
            }

            public String toString() {
                String str = this.label;
                String str2 = this.value;
                return d.i(l0.b("EightFitRecipeNutritionalValue(label=", str, ", value=", str2, ", children="), this.children, ")");
            }

            public EightFitRecipeNutritionalValue(String label, String value, List<EightFitRecipeNutritionalValueChildren> list) {
                u.j(label, "label");
                u.j(value, "value");
                this.label = label;
                this.value = value;
                this.children = list;
            }
        }

        /* compiled from: EightFitRecipeContent.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB/\b\u0011\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001d\u0010\r¨\u0006&"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", Constants.ScionAnalytics.PARAM_LABEL, "value", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
        @Serializable
        /* loaded from: classes3.dex */
        public static final class EightFitRecipeNutritionalValueChildren {
            public static final C0465Companion Companion = new C0465Companion(null);
            private final String label;
            private final String value;

            /* compiled from: EightFitRecipeContent.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren$Companion  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0465Companion {
                public /* synthetic */ C0465Companion(m mVar) {
                    this();
                }

                public final KSerializer<EightFitRecipeNutritionalValueChildren> serializer() {
                    return EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren$$serializer.INSTANCE;
                }

                private C0465Companion() {
                }
            }

            public /* synthetic */ EightFitRecipeNutritionalValueChildren(int i11, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i11 & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 3, EightFitRecipeContent$Companion$EightFitRecipeNutritionalValueChildren$$serializer.INSTANCE.getDescriptor());
                }
                this.label = str;
                this.value = str2;
            }

            public static /* synthetic */ EightFitRecipeNutritionalValueChildren copy$default(EightFitRecipeNutritionalValueChildren eightFitRecipeNutritionalValueChildren, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = eightFitRecipeNutritionalValueChildren.label;
                }
                if ((i11 & 2) != 0) {
                    str2 = eightFitRecipeNutritionalValueChildren.value;
                }
                return eightFitRecipeNutritionalValueChildren.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$eightfit_release(EightFitRecipeNutritionalValueChildren eightFitRecipeNutritionalValueChildren, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitRecipeNutritionalValueChildren.label);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, eightFitRecipeNutritionalValueChildren.value);
            }

            public final String component1() {
                return this.label;
            }

            public final String component2() {
                return this.value;
            }

            public final EightFitRecipeNutritionalValueChildren copy(String label, String value) {
                u.j(label, "label");
                u.j(value, "value");
                return new EightFitRecipeNutritionalValueChildren(label, value);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EightFitRecipeNutritionalValueChildren)) {
                    return false;
                }
                EightFitRecipeNutritionalValueChildren eightFitRecipeNutritionalValueChildren = (EightFitRecipeNutritionalValueChildren) obj;
                if (u.e(this.label, eightFitRecipeNutritionalValueChildren.label) && u.e(this.value, eightFitRecipeNutritionalValueChildren.value)) {
                    return true;
                }
                return false;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + (this.label.hashCode() * 31);
            }

            public String toString() {
                return k0.c("EightFitRecipeNutritionalValueChildren(label=", this.label, ", value=", this.value, ")");
            }

            public EightFitRecipeNutritionalValueChildren(String label, String value) {
                u.j(label, "label");
                u.j(value, "value");
                this.label = label;
                this.value = value;
            }
        }

        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EightFitRecipeContent> serializer() {
            return EightFitRecipeContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EightFitRecipeContent(int i11, String str, List list, String str2, String str3, String str4, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (255 != (i11 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 255, EightFitRecipeContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.tags = list;
        this.title = str2;
        this.featureImage = str3;
        this.description = str4;
        this.nutritionalValue = list2;
        this.ingredients = list3;
        this.instructions = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EightFitRecipeContent copy$default(EightFitRecipeContent eightFitRecipeContent, String str, List list, String str2, String str3, String str4, List list2, List list3, List list4, int i11, Object obj) {
        String str5;
        List<EightFitContent.EightFitTag> list5;
        String str6;
        String str7;
        String str8;
        List<Companion.EightFitRecipeNutritionalValue> list6;
        List<Companion.EightFitRecipeIngredient> list7;
        List<Companion.EightFitRecipeInstruction> list8;
        if ((i11 & 1) != 0) {
            str5 = eightFitRecipeContent.identifier;
        } else {
            str5 = str;
        }
        if ((i11 & 2) != 0) {
            list5 = eightFitRecipeContent.tags;
        } else {
            list5 = list;
        }
        if ((i11 & 4) != 0) {
            str6 = eightFitRecipeContent.title;
        } else {
            str6 = str2;
        }
        if ((i11 & 8) != 0) {
            str7 = eightFitRecipeContent.featureImage;
        } else {
            str7 = str3;
        }
        if ((i11 & 16) != 0) {
            str8 = eightFitRecipeContent.description;
        } else {
            str8 = str4;
        }
        if ((i11 & 32) != 0) {
            list6 = eightFitRecipeContent.nutritionalValue;
        } else {
            list6 = list2;
        }
        if ((i11 & 64) != 0) {
            list7 = eightFitRecipeContent.ingredients;
        } else {
            list7 = list3;
        }
        if ((i11 & 128) != 0) {
            list8 = eightFitRecipeContent.instructions;
        } else {
            list8 = list4;
        }
        return eightFitRecipeContent.copy(str5, list5, str6, str7, str8, list6, list7, list8);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(EightFitRecipeContent eightFitRecipeContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        EightFitContent.write$Self(eightFitRecipeContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitRecipeContent.getIdentifier());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eightFitRecipeContent.getTags());
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eightFitRecipeContent.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, eightFitRecipeContent.featureImage);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, eightFitRecipeContent.description);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], eightFitRecipeContent.nutritionalValue);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], eightFitRecipeContent.ingredients);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], eightFitRecipeContent.instructions);
    }

    public final String component1() {
        return this.identifier;
    }

    public final List<EightFitContent.EightFitTag> component2() {
        return this.tags;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.featureImage;
    }

    public final String component5() {
        return this.description;
    }

    public final List<Companion.EightFitRecipeNutritionalValue> component6() {
        return this.nutritionalValue;
    }

    public final List<Companion.EightFitRecipeIngredient> component7() {
        return this.ingredients;
    }

    public final List<Companion.EightFitRecipeInstruction> component8() {
        return this.instructions;
    }

    public final EightFitRecipeContent copy(String identifier, List<EightFitContent.EightFitTag> tags, String title, String featureImage, String str, List<Companion.EightFitRecipeNutritionalValue> nutritionalValue, List<Companion.EightFitRecipeIngredient> ingredients, List<Companion.EightFitRecipeInstruction> instructions) {
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(nutritionalValue, "nutritionalValue");
        u.j(ingredients, "ingredients");
        u.j(instructions, "instructions");
        return new EightFitRecipeContent(identifier, tags, title, featureImage, str, nutritionalValue, ingredients, instructions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EightFitRecipeContent)) {
            return false;
        }
        EightFitRecipeContent eightFitRecipeContent = (EightFitRecipeContent) obj;
        if (u.e(this.identifier, eightFitRecipeContent.identifier) && u.e(this.tags, eightFitRecipeContent.tags) && u.e(this.title, eightFitRecipeContent.title) && u.e(this.featureImage, eightFitRecipeContent.featureImage) && u.e(this.description, eightFitRecipeContent.description) && u.e(this.nutritionalValue, eightFitRecipeContent.nutritionalValue) && u.e(this.ingredients, eightFitRecipeContent.ingredients) && u.e(this.instructions, eightFitRecipeContent.instructions)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public String getIdentifier() {
        return this.identifier;
    }

    public final List<Companion.EightFitRecipeIngredient> getIngredients() {
        return this.ingredients;
    }

    public final List<Companion.EightFitRecipeInstruction> getInstructions() {
        return this.instructions;
    }

    public final List<Companion.EightFitRecipeNutritionalValue> getNutritionalValue() {
        return this.nutritionalValue;
    }

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public List<EightFitContent.EightFitTag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c11 = d.c(this.featureImage, d.c(this.title, e.b(this.tags, this.identifier.hashCode() * 31, 31), 31), 31);
        String str = this.description;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.instructions.hashCode() + e.b(this.ingredients, e.b(this.nutritionalValue, (c11 + hashCode) * 31, 31), 31);
    }

    public String toString() {
        String str = this.identifier;
        List<EightFitContent.EightFitTag> list = this.tags;
        String str2 = this.title;
        String str3 = this.featureImage;
        String str4 = this.description;
        List<Companion.EightFitRecipeNutritionalValue> list2 = this.nutritionalValue;
        List<Companion.EightFitRecipeIngredient> list3 = this.ingredients;
        List<Companion.EightFitRecipeInstruction> list4 = this.instructions;
        StringBuilder sb2 = new StringBuilder("EightFitRecipeContent(identifier=");
        sb2.append(str);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(", title=");
        b.d(sb2, str2, ", featureImage=", str3, ", description=");
        c.d(sb2, str4, ", nutritionalValue=", list2, ", ingredients=");
        sb2.append(list3);
        sb2.append(", instructions=");
        sb2.append(list4);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EightFitRecipeContent(String identifier, List<EightFitContent.EightFitTag> tags, String title, String featureImage, String str, List<Companion.EightFitRecipeNutritionalValue> nutritionalValue, List<Companion.EightFitRecipeIngredient> ingredients, List<Companion.EightFitRecipeInstruction> instructions) {
        super(null);
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(nutritionalValue, "nutritionalValue");
        u.j(ingredients, "ingredients");
        u.j(instructions, "instructions");
        this.identifier = identifier;
        this.tags = tags;
        this.title = title;
        this.featureImage = featureImage;
        this.description = str;
        this.nutritionalValue = nutritionalValue;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
}
