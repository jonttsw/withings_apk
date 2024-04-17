package com.withings.contentproviders.eightfit.model.webservice;

import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent;
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
/* compiled from: WsRecipeContent.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBk\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017¢\u0006\u0004\bA\u0010BB\u008d\u0001\b\u0011\u0012\u0006\u0010C\u001a\u00020-\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0017\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0017\u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0017\u0012\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bA\u0010FJ(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0086\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b,\u0010\u0010J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010!\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b6\u0010\u0010R\u001a\u0010\"\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b7\u0010\u0010R\u001a\u0010#\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\b8\u0010\u0010R\u001c\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b9\u0010\u0010R\u001c\u0010%\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010:\u001a\u0004\b;\u0010\u0016R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b=\u0010\u001aR \u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010<\u001a\u0004\b>\u0010\u001aR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010<\u001a\u0004\b?\u0010\u001aR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010<\u001a\u0004\b@\u0010\u001a¨\u0006I"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;", "toEightFit", "()Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "component5", "()Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeNutritionalValue;", "component6", "()Ljava/util/List;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeIngredient;", "component7", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeInstruction;", "component8", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "component9", "identifier", "title", "featureImage", "contextualizedDescription", "contextualized", "nutritionalValue", "ingredients", "instructions", "tags", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getTitle", "getFeatureImage", "getContextualizedDescription", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "getContextualized", "Ljava/util/List;", "getNutritionalValue", "getIngredients", "getInstructions", "getTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsRecipeContent extends WsContent {
    @SerializedName("contextualized")
    private final WsContextualized contextualized;
    @SerializedName("contextualized_description")
    private final String contextualizedDescription;
    @SerializedName("feature_image")
    private final String featureImage;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("ingredients")
    private final List<WsRecipeIngredient> ingredients;
    @SerializedName("instructions")
    private final List<WsRecipeInstruction> instructions;
    @SerializedName("nutritional_value")
    private final List<WsRecipeNutritionalValue> nutritionalValue;
    @SerializedName("tags")
    private final List<WsTag> tags;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(WsRecipeNutritionalValue$$serializer.INSTANCE), new ArrayListSerializer(WsRecipeIngredient$$serializer.INSTANCE), new ArrayListSerializer(WsRecipeInstruction$$serializer.INSTANCE), new ArrayListSerializer(WsTag$$serializer.INSTANCE)};

    /* compiled from: WsRecipeContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsRecipeContent> serializer() {
            return WsRecipeContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WsRecipeContent(int i11, String str, String str2, String str3, String str4, WsContextualized wsContextualized, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (511 != (i11 & 511)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 511, WsRecipeContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.title = str2;
        this.featureImage = str3;
        this.contextualizedDescription = str4;
        this.contextualized = wsContextualized;
        this.nutritionalValue = list;
        this.ingredients = list2;
        this.instructions = list3;
        this.tags = list4;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsRecipeContent copy$default(WsRecipeContent wsRecipeContent, String str, String str2, String str3, String str4, WsContextualized wsContextualized, List list, List list2, List list3, List list4, int i11, Object obj) {
        String str5;
        String str6;
        String str7;
        String str8;
        WsContextualized wsContextualized2;
        List<WsRecipeNutritionalValue> list5;
        List<WsRecipeIngredient> list6;
        List<WsRecipeInstruction> list7;
        List<WsTag> list8;
        if ((i11 & 1) != 0) {
            str5 = wsRecipeContent.identifier;
        } else {
            str5 = str;
        }
        if ((i11 & 2) != 0) {
            str6 = wsRecipeContent.title;
        } else {
            str6 = str2;
        }
        if ((i11 & 4) != 0) {
            str7 = wsRecipeContent.featureImage;
        } else {
            str7 = str3;
        }
        if ((i11 & 8) != 0) {
            str8 = wsRecipeContent.contextualizedDescription;
        } else {
            str8 = str4;
        }
        if ((i11 & 16) != 0) {
            wsContextualized2 = wsRecipeContent.contextualized;
        } else {
            wsContextualized2 = wsContextualized;
        }
        if ((i11 & 32) != 0) {
            list5 = wsRecipeContent.nutritionalValue;
        } else {
            list5 = list;
        }
        if ((i11 & 64) != 0) {
            list6 = wsRecipeContent.ingredients;
        } else {
            list6 = list2;
        }
        if ((i11 & 128) != 0) {
            list7 = wsRecipeContent.instructions;
        } else {
            list7 = list3;
        }
        if ((i11 & 256) != 0) {
            list8 = wsRecipeContent.tags;
        } else {
            list8 = list4;
        }
        return wsRecipeContent.copy(str5, str6, str7, str8, wsContextualized2, list5, list6, list7, list8);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsRecipeContent wsRecipeContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WsContent.write$Self(wsRecipeContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsRecipeContent.identifier);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsRecipeContent.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, wsRecipeContent.featureImage);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, wsRecipeContent.contextualizedDescription);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, WsContextualized$$serializer.INSTANCE, wsRecipeContent.contextualized);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], wsRecipeContent.nutritionalValue);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], wsRecipeContent.ingredients);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], wsRecipeContent.instructions);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], wsRecipeContent.tags);
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.featureImage;
    }

    public final String component4() {
        return this.contextualizedDescription;
    }

    public final WsContextualized component5() {
        return this.contextualized;
    }

    public final List<WsRecipeNutritionalValue> component6() {
        return this.nutritionalValue;
    }

    public final List<WsRecipeIngredient> component7() {
        return this.ingredients;
    }

    public final List<WsRecipeInstruction> component8() {
        return this.instructions;
    }

    public final List<WsTag> component9() {
        return this.tags;
    }

    public final WsRecipeContent copy(String identifier, String title, String featureImage, String str, WsContextualized wsContextualized, List<WsRecipeNutritionalValue> nutritionalValue, List<WsRecipeIngredient> ingredients, List<WsRecipeInstruction> instructions, List<WsTag> tags) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(nutritionalValue, "nutritionalValue");
        u.j(ingredients, "ingredients");
        u.j(instructions, "instructions");
        u.j(tags, "tags");
        return new WsRecipeContent(identifier, title, featureImage, str, wsContextualized, nutritionalValue, ingredients, instructions, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsRecipeContent)) {
            return false;
        }
        WsRecipeContent wsRecipeContent = (WsRecipeContent) obj;
        if (u.e(this.identifier, wsRecipeContent.identifier) && u.e(this.title, wsRecipeContent.title) && u.e(this.featureImage, wsRecipeContent.featureImage) && u.e(this.contextualizedDescription, wsRecipeContent.contextualizedDescription) && u.e(this.contextualized, wsRecipeContent.contextualized) && u.e(this.nutritionalValue, wsRecipeContent.nutritionalValue) && u.e(this.ingredients, wsRecipeContent.ingredients) && u.e(this.instructions, wsRecipeContent.instructions) && u.e(this.tags, wsRecipeContent.tags)) {
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

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<WsRecipeIngredient> getIngredients() {
        return this.ingredients;
    }

    public final List<WsRecipeInstruction> getInstructions() {
        return this.instructions;
    }

    public final List<WsRecipeNutritionalValue> getNutritionalValue() {
        return this.nutritionalValue;
    }

    public final List<WsTag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int c11 = d.c(this.featureImage, d.c(this.title, this.identifier.hashCode() * 31, 31), 31);
        String str = this.contextualizedDescription;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        WsContextualized wsContextualized = this.contextualized;
        if (wsContextualized != null) {
            i11 = wsContextualized.hashCode();
        }
        return this.tags.hashCode() + e.b(this.instructions, e.b(this.ingredients, e.b(this.nutritionalValue, (i12 + i11) * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.title;
        String str3 = this.featureImage;
        String str4 = this.contextualizedDescription;
        WsContextualized wsContextualized = this.contextualized;
        List<WsRecipeNutritionalValue> list = this.nutritionalValue;
        List<WsRecipeIngredient> list2 = this.ingredients;
        List<WsRecipeInstruction> list3 = this.instructions;
        List<WsTag> list4 = this.tags;
        StringBuilder b10 = l0.b("WsRecipeContent(identifier=", str, ", title=", str2, ", featureImage=");
        b.d(b10, str3, ", contextualizedDescription=", str4, ", contextualized=");
        b10.append(wsContextualized);
        b10.append(", nutritionalValue=");
        b10.append(list);
        b10.append(", ingredients=");
        a.a(b10, list2, ", instructions=", list3, ", tags=");
        return d.i(b10, list4, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsRecipeContent(String identifier, String title, String featureImage, String str, WsContextualized wsContextualized, List<WsRecipeNutritionalValue> nutritionalValue, List<WsRecipeIngredient> ingredients, List<WsRecipeInstruction> instructions, List<WsTag> tags) {
        super(null);
        u.j(identifier, "identifier");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(nutritionalValue, "nutritionalValue");
        u.j(ingredients, "ingredients");
        u.j(instructions, "instructions");
        u.j(tags, "tags");
        this.identifier = identifier;
        this.title = title;
        this.featureImage = featureImage;
        this.contextualizedDescription = str;
        this.contextualized = wsContextualized;
        this.nutritionalValue = nutritionalValue;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.tags = tags;
    }

    @Override // com.withings.contentproviders.eightfit.model.webservice.WsContent
    public EightFitRecipeContent toEightFit() {
        String str;
        String str2 = this.identifier;
        ArrayList d11 = c.d(this.tags);
        String str3 = this.title;
        String str4 = this.featureImage;
        WsContextualized wsContextualized = this.contextualized;
        if (wsContextualized == null || (str = wsContextualized.getDescription()) == null) {
            str = this.contextualizedDescription;
        }
        return new EightFitRecipeContent(str2, d11, str3, str4, str, WsRecipeNutritionalValue.Companion.toEntity(this.nutritionalValue), WsRecipeIngredient.Companion.toEntity(this.ingredients), WsRecipeInstruction.Companion.toEntity(this.instructions));
    }
}
