package com.withings.contentproviders.eightfit.model.content;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
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
/* compiled from: EightFitObjectiveContent.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BU\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u0015\u0012\u0006\u0010#\u001a\u00020\u0018\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e¢\u0006\u0004\b:\u0010;Bs\b\u0011\u0012\u0006\u0010<\u001a\u00020\u0015\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\"\u001a\u00020\u0015\u0012\u0006\u0010#\u001a\u00020\u0018\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b:\u0010?J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0011Jn\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\u00182\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010\rJ\u0010\u0010(\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u001d\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u0010\rR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\b1\u0010\u0011R\u0017\u0010\u001f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b2\u0010\rR\u0019\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b3\u0010\rR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b4\u0010\rR\u0017\u0010\"\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010#\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b8\u0010\u001aR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b9\u0010\u0011¨\u0006B"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "", "component6", "()I", "", "component7", "()D", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "component8", "identifier", "tags", "title", HealthConstants.FoodInfo.DESCRIPTION, "featureImage", "measureType", "goal", "recommendedDevices", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/util/List;)Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "Ljava/util/List;", "getTags", "getTitle", "getDescription", "getFeatureImage", "I", "getMeasureType", "D", "getGoal", "getRecommendedDevices", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class EightFitObjectiveContent extends EightFitContent {
    private final String description;
    private final String featureImage;
    private final double goal;
    private final String identifier;
    private final int measureType;
    private final List<EightFitContent.EightFitRecommendedDevice> recommendedDevices;
    private final List<EightFitContent.EightFitTag> tags;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EightFitContent$EightFitTag$$serializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(EightFitContent$EightFitRecommendedDevice$$serializer.INSTANCE)};

    /* compiled from: EightFitObjectiveContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EightFitObjectiveContent> serializer() {
            return EightFitObjectiveContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EightFitObjectiveContent(int i11, String str, List list, String str2, String str3, String str4, int i12, double d11, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (255 != (i11 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 255, EightFitObjectiveContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.tags = list;
        this.title = str2;
        this.description = str3;
        this.featureImage = str4;
        this.measureType = i12;
        this.goal = d11;
        this.recommendedDevices = list2;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EightFitObjectiveContent copy$default(EightFitObjectiveContent eightFitObjectiveContent, String str, List list, String str2, String str3, String str4, int i11, double d11, List list2, int i12, Object obj) {
        String str5;
        List<EightFitContent.EightFitTag> list3;
        String str6;
        String str7;
        String str8;
        int i13;
        double d12;
        List<EightFitContent.EightFitRecommendedDevice> list4;
        if ((i12 & 1) != 0) {
            str5 = eightFitObjectiveContent.identifier;
        } else {
            str5 = str;
        }
        if ((i12 & 2) != 0) {
            list3 = eightFitObjectiveContent.tags;
        } else {
            list3 = list;
        }
        if ((i12 & 4) != 0) {
            str6 = eightFitObjectiveContent.title;
        } else {
            str6 = str2;
        }
        if ((i12 & 8) != 0) {
            str7 = eightFitObjectiveContent.description;
        } else {
            str7 = str3;
        }
        if ((i12 & 16) != 0) {
            str8 = eightFitObjectiveContent.featureImage;
        } else {
            str8 = str4;
        }
        if ((i12 & 32) != 0) {
            i13 = eightFitObjectiveContent.measureType;
        } else {
            i13 = i11;
        }
        if ((i12 & 64) != 0) {
            d12 = eightFitObjectiveContent.goal;
        } else {
            d12 = d11;
        }
        if ((i12 & 128) != 0) {
            list4 = eightFitObjectiveContent.recommendedDevices;
        } else {
            list4 = list2;
        }
        return eightFitObjectiveContent.copy(str5, list3, str6, str7, str8, i13, d12, list4);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(EightFitObjectiveContent eightFitObjectiveContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        EightFitContent.write$Self(eightFitObjectiveContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitObjectiveContent.getIdentifier());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eightFitObjectiveContent.getTags());
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eightFitObjectiveContent.title);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eightFitObjectiveContent.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, eightFitObjectiveContent.featureImage);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, eightFitObjectiveContent.measureType);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 6, eightFitObjectiveContent.goal);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], eightFitObjectiveContent.recommendedDevices);
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
        return this.description;
    }

    public final String component5() {
        return this.featureImage;
    }

    public final int component6() {
        return this.measureType;
    }

    public final double component7() {
        return this.goal;
    }

    public final List<EightFitContent.EightFitRecommendedDevice> component8() {
        return this.recommendedDevices;
    }

    public final EightFitObjectiveContent copy(String identifier, List<EightFitContent.EightFitTag> tags, String title, String str, String featureImage, int i11, double d11, List<EightFitContent.EightFitRecommendedDevice> recommendedDevices) {
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(recommendedDevices, "recommendedDevices");
        return new EightFitObjectiveContent(identifier, tags, title, str, featureImage, i11, d11, recommendedDevices);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EightFitObjectiveContent)) {
            return false;
        }
        EightFitObjectiveContent eightFitObjectiveContent = (EightFitObjectiveContent) obj;
        if (u.e(this.identifier, eightFitObjectiveContent.identifier) && u.e(this.tags, eightFitObjectiveContent.tags) && u.e(this.title, eightFitObjectiveContent.title) && u.e(this.description, eightFitObjectiveContent.description) && u.e(this.featureImage, eightFitObjectiveContent.featureImage) && this.measureType == eightFitObjectiveContent.measureType && Double.compare(this.goal, eightFitObjectiveContent.goal) == 0 && u.e(this.recommendedDevices, eightFitObjectiveContent.recommendedDevices)) {
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

    public final double getGoal() {
        return this.goal;
    }

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public String getIdentifier() {
        return this.identifier;
    }

    public final int getMeasureType() {
        return this.measureType;
    }

    public final List<EightFitContent.EightFitRecommendedDevice> getRecommendedDevices() {
        return this.recommendedDevices;
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
        int c11 = d.c(this.title, e.b(this.tags, this.identifier.hashCode() * 31, 31), 31);
        String str = this.description;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.recommendedDevices.hashCode() + l0.a(this.goal, h.a(this.measureType, d.c(this.featureImage, (c11 + hashCode) * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.identifier;
        List<EightFitContent.EightFitTag> list = this.tags;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.featureImage;
        int i11 = this.measureType;
        double d11 = this.goal;
        List<EightFitContent.EightFitRecommendedDevice> list2 = this.recommendedDevices;
        StringBuilder sb2 = new StringBuilder("EightFitObjectiveContent(identifier=");
        sb2.append(str);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(", title=");
        b.d(sb2, str2, ", description=", str3, ", featureImage=");
        sb2.append(str4);
        sb2.append(", measureType=");
        sb2.append(i11);
        sb2.append(", goal=");
        sb2.append(d11);
        sb2.append(", recommendedDevices=");
        sb2.append(list2);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EightFitObjectiveContent(String identifier, List<EightFitContent.EightFitTag> tags, String title, String str, String featureImage, int i11, double d11, List<EightFitContent.EightFitRecommendedDevice> recommendedDevices) {
        super(null);
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(recommendedDevices, "recommendedDevices");
        this.identifier = identifier;
        this.tags = tags;
        this.title = title;
        this.description = str;
        this.featureImage = featureImage;
        this.measureType = i11;
        this.goal = d11;
        this.recommendedDevices = recommendedDevices;
    }
}
