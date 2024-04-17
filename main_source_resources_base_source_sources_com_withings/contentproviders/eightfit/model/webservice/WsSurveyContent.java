package com.withings.contentproviders.eightfit.model.webservice;

import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.contentproviders.eightfit.model.content.EightFitSurveyContent;
import dp0.j;
import java.util.ArrayList;
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
import zl.c;
/* compiled from: WsSurveyContent.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABU\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010 \u001a\u00020\u000e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b;\u0010<Bq\b\u0011\u0012\u0006\u0010=\u001a\u00020(\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b;\u0010@J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJl\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010 \u001a\u00020\u000e2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\"\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010\u0010J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u001d\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b1\u0010\u0010R\u001a\u0010\u001e\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\b2\u0010\u0010R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b3\u0010\u0010R\u001a\u0010 \u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00100\u001a\u0004\b4\u0010\u0010R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b6\u0010\u0017R\u001a\u0010\"\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b7\u0010\u0010R\u001c\u0010#\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b8\u0010\u0010R\u001c\u0010$\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00109\u001a\u0004\b:\u0010\u001c¨\u0006C"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/withings/contentproviders/eightfit/model/content/EightFitSurveyContent;", "toEightFit", "()Lcom/withings/contentproviders/eightfit/model/content/EightFitSurveyContent;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "component5", "()Ljava/util/List;", "component6", "component7", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "component8", "()Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "id", "title", HealthConstants.FoodInfo.DESCRIPTION, "featureImage", "tags", "surveyId", "contextualizedDescription", "contextualized", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;)Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "getFeatureImage", "Ljava/util/List;", "getTags", "getSurveyId", "getContextualizedDescription", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "getContextualized", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsSurveyContent extends WsContent {
    @SerializedName("contextualized")
    private final WsContextualized contextualized;
    @SerializedName("contextualized_description")
    private final String contextualizedDescription;
    @SerializedName(HealthConstants.FoodInfo.DESCRIPTION)
    private final String description;
    @SerializedName("feature_image")
    private final String featureImage;
    @SerializedName("identifier")

    /* renamed from: id */
    private final String f35289id;
    @SerializedName("survey_id")
    private final String surveyId;
    @SerializedName("tags")
    private final List<WsTag> tags;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(WsTag$$serializer.INSTANCE), null, null, null};

    /* compiled from: WsSurveyContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsSurveyContent> serializer() {
            return WsSurveyContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WsSurveyContent(int i11, String str, String str2, String str3, String str4, List list, String str5, String str6, WsContextualized wsContextualized, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (127 != (i11 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 127, WsSurveyContent$$serializer.INSTANCE.getDescriptor());
        }
        this.f35289id = str;
        this.title = str2;
        this.description = str3;
        this.featureImage = str4;
        this.tags = list;
        this.surveyId = str5;
        this.contextualizedDescription = str6;
        if ((i11 & 128) == 0) {
            this.contextualized = null;
        } else {
            this.contextualized = wsContextualized;
        }
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsSurveyContent copy$default(WsSurveyContent wsSurveyContent, String str, String str2, String str3, String str4, List list, String str5, String str6, WsContextualized wsContextualized, int i11, Object obj) {
        String str7;
        String str8;
        String str9;
        String str10;
        List<WsTag> list2;
        String str11;
        String str12;
        WsContextualized wsContextualized2;
        if ((i11 & 1) != 0) {
            str7 = wsSurveyContent.f35289id;
        } else {
            str7 = str;
        }
        if ((i11 & 2) != 0) {
            str8 = wsSurveyContent.title;
        } else {
            str8 = str2;
        }
        if ((i11 & 4) != 0) {
            str9 = wsSurveyContent.description;
        } else {
            str9 = str3;
        }
        if ((i11 & 8) != 0) {
            str10 = wsSurveyContent.featureImage;
        } else {
            str10 = str4;
        }
        if ((i11 & 16) != 0) {
            list2 = wsSurveyContent.tags;
        } else {
            list2 = list;
        }
        if ((i11 & 32) != 0) {
            str11 = wsSurveyContent.surveyId;
        } else {
            str11 = str5;
        }
        if ((i11 & 64) != 0) {
            str12 = wsSurveyContent.contextualizedDescription;
        } else {
            str12 = str6;
        }
        if ((i11 & 128) != 0) {
            wsContextualized2 = wsSurveyContent.contextualized;
        } else {
            wsContextualized2 = wsContextualized;
        }
        return wsSurveyContent.copy(str7, str8, str9, str10, list2, str11, str12, wsContextualized2);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsSurveyContent wsSurveyContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WsContent.write$Self(wsSurveyContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsSurveyContent.f35289id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsSurveyContent.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, wsSurveyContent.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, wsSurveyContent.featureImage);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], wsSurveyContent.tags);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, wsSurveyContent.surveyId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, wsSurveyContent.contextualizedDescription);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || wsSurveyContent.contextualized != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, WsContextualized$$serializer.INSTANCE, wsSurveyContent.contextualized);
        }
    }

    public final String component1() {
        return this.f35289id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.featureImage;
    }

    public final List<WsTag> component5() {
        return this.tags;
    }

    public final String component6() {
        return this.surveyId;
    }

    public final String component7() {
        return this.contextualizedDescription;
    }

    public final WsContextualized component8() {
        return this.contextualized;
    }

    public final WsSurveyContent copy(String id2, String title, String str, String featureImage, List<WsTag> tags, String surveyId, String str2, WsContextualized wsContextualized) {
        u.j(id2, "id");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(surveyId, "surveyId");
        return new WsSurveyContent(id2, title, str, featureImage, tags, surveyId, str2, wsContextualized);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsSurveyContent)) {
            return false;
        }
        WsSurveyContent wsSurveyContent = (WsSurveyContent) obj;
        if (u.e(this.f35289id, wsSurveyContent.f35289id) && u.e(this.title, wsSurveyContent.title) && u.e(this.description, wsSurveyContent.description) && u.e(this.featureImage, wsSurveyContent.featureImage) && u.e(this.tags, wsSurveyContent.tags) && u.e(this.surveyId, wsSurveyContent.surveyId) && u.e(this.contextualizedDescription, wsSurveyContent.contextualizedDescription) && u.e(this.contextualized, wsSurveyContent.contextualized)) {
            return true;
        }
        return false;
    }

    public final WsContextualized getContextualized() {
        return this.contextualized;
    }

    public final String getContextualizedDescription() {
        return this.contextualizedDescription;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getId() {
        return this.f35289id;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public final List<WsTag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c11 = d.c(this.title, this.f35289id.hashCode() * 31, 31);
        String str = this.description;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c12 = d.c(this.surveyId, e.b(this.tags, d.c(this.featureImage, (c11 + hashCode) * 31, 31), 31), 31);
        String str2 = this.contextualizedDescription;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (c12 + hashCode2) * 31;
        WsContextualized wsContextualized = this.contextualized;
        if (wsContextualized != null) {
            i11 = wsContextualized.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.f35289id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.featureImage;
        List<WsTag> list = this.tags;
        String str5 = this.surveyId;
        String str6 = this.contextualizedDescription;
        WsContextualized wsContextualized = this.contextualized;
        StringBuilder b10 = l0.b("WsSurveyContent(id=", str, ", title=", str2, ", description=");
        b.d(b10, str3, ", featureImage=", str4, ", tags=");
        b10.append(list);
        b10.append(", surveyId=");
        b10.append(str5);
        b10.append(", contextualizedDescription=");
        b10.append(str6);
        b10.append(", contextualized=");
        b10.append(wsContextualized);
        b10.append(")");
        return b10.toString();
    }

    public /* synthetic */ WsSurveyContent(String str, String str2, String str3, String str4, List list, String str5, String str6, WsContextualized wsContextualized, int i11, m mVar) {
        this(str, str2, str3, str4, list, str5, str6, (i11 & 128) != 0 ? null : wsContextualized);
    }

    @Override // com.withings.contentproviders.eightfit.model.webservice.WsContent
    public EightFitSurveyContent toEightFit() {
        String str;
        String str2 = this.f35289id;
        ArrayList d11 = c.d(this.tags);
        String str3 = this.title;
        String str4 = this.featureImage;
        WsContextualized wsContextualized = this.contextualized;
        if ((wsContextualized == null || (str = wsContextualized.getDescription()) == null) && (str = this.contextualizedDescription) == null) {
            str = this.description;
        }
        String str5 = null;
        if (str != null && (!j.D(str))) {
            str5 = str;
        }
        return new EightFitSurveyContent(str2, d11, str5, str4, this.surveyId, str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsSurveyContent(String id2, String title, String str, String featureImage, List<WsTag> tags, String surveyId, String str2, WsContextualized wsContextualized) {
        super(null);
        u.j(id2, "id");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(surveyId, "surveyId");
        this.f35289id = id2;
        this.title = title;
        this.description = str;
        this.featureImage = featureImage;
        this.tags = tags;
        this.surveyId = surveyId;
        this.contextualizedDescription = str2;
        this.contextualized = wsContextualized;
    }
}
