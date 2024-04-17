package com.withings.contentproviders.eightfit.model.webservice;

import androidx.camera.camera2.internal.l0;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: WsRecipeContent.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b%\u0010&B?\b\u0011\u0012\u0006\u0010'\u001a\u00020\u0019\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\"\u0010\rR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006-"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeNutritionalValue;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeNutritionalValue;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeNutritionalValueChildren;", "component3", "()Ljava/util/List;", Constants.ScionAnalytics.PARAM_LABEL, "value", "children", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeNutritionalValue;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getValue", "Ljava/util/List;", "getChildren", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsRecipeNutritionalValue {
    @SerializedName("children")
    private final List<WsRecipeNutritionalValueChildren> children;
    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;
    @SerializedName("value")
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(WsRecipeNutritionalValueChildren$$serializer.INSTANCE)};

    /* compiled from: WsRecipeContent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\t"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeNutritionalValue$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeNutritionalValue;", "toEntity", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeNutritionalValue;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsRecipeNutritionalValue> serializer() {
            return WsRecipeNutritionalValue$$serializer.INSTANCE;
        }

        public final List<EightFitRecipeContent.Companion.EightFitRecipeNutritionalValue> toEntity(List<WsRecipeNutritionalValue> list) {
            List<EightFitRecipeContent.Companion.EightFitRecipeNutritionalValueChildren> list2;
            u.j(list, "<this>");
            List<WsRecipeNutritionalValue> list3 = list;
            ArrayList arrayList = new ArrayList(x.y(list3, 10));
            for (WsRecipeNutritionalValue wsRecipeNutritionalValue : list3) {
                String label = wsRecipeNutritionalValue.getLabel();
                String value = wsRecipeNutritionalValue.getValue();
                List<WsRecipeNutritionalValueChildren> children = wsRecipeNutritionalValue.getChildren();
                if (children != null) {
                    list2 = WsRecipeNutritionalValueChildren.Companion.toEntity(children);
                } else {
                    list2 = null;
                }
                arrayList.add(new EightFitRecipeContent.Companion.EightFitRecipeNutritionalValue(label, value, list2));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsRecipeNutritionalValue(int i11, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, WsRecipeNutritionalValue$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.value = str2;
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsRecipeNutritionalValue copy$default(WsRecipeNutritionalValue wsRecipeNutritionalValue, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsRecipeNutritionalValue.label;
        }
        if ((i11 & 2) != 0) {
            str2 = wsRecipeNutritionalValue.value;
        }
        if ((i11 & 4) != 0) {
            list = wsRecipeNutritionalValue.children;
        }
        return wsRecipeNutritionalValue.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsRecipeNutritionalValue wsRecipeNutritionalValue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsRecipeNutritionalValue.label);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsRecipeNutritionalValue.value);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], wsRecipeNutritionalValue.children);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final List<WsRecipeNutritionalValueChildren> component3() {
        return this.children;
    }

    public final WsRecipeNutritionalValue copy(String label, String value, List<WsRecipeNutritionalValueChildren> list) {
        u.j(label, "label");
        u.j(value, "value");
        return new WsRecipeNutritionalValue(label, value, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsRecipeNutritionalValue)) {
            return false;
        }
        WsRecipeNutritionalValue wsRecipeNutritionalValue = (WsRecipeNutritionalValue) obj;
        if (u.e(this.label, wsRecipeNutritionalValue.label) && u.e(this.value, wsRecipeNutritionalValue.value) && u.e(this.children, wsRecipeNutritionalValue.children)) {
            return true;
        }
        return false;
    }

    public final List<WsRecipeNutritionalValueChildren> getChildren() {
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
        List<WsRecipeNutritionalValueChildren> list = this.children;
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
        return d.i(l0.b("WsRecipeNutritionalValue(label=", str, ", value=", str2, ", children="), this.children, ")");
    }

    public WsRecipeNutritionalValue(String label, String value, List<WsRecipeNutritionalValueChildren> list) {
        u.j(label, "label");
        u.j(value, "value");
        this.label = label;
        this.value = value;
        this.children = list;
    }
}
