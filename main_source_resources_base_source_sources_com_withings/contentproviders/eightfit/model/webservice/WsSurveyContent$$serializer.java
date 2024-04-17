package com.withings.contentproviders.eightfit.model.webservice;

import com.samsung.android.sdk.healthdata.HealthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsSurveyContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/webservice/WsSurveyContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/webservice/WsSurveyContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsSurveyContent$$serializer implements GeneratedSerializer<WsSurveyContent> {
    public static final WsSurveyContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsSurveyContent$$serializer wsSurveyContent$$serializer = new WsSurveyContent$$serializer();
        INSTANCE = wsSurveyContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.webservice.WsSurveyContent", wsSurveyContent$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.FoodInfo.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("surveyId", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizedDescription", false);
        pluginGeneratedSerialDescriptor.addElement("contextualized", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsSurveyContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = WsSurveyContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, access$get$childSerializers$cp[4], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(WsContextualized$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsSurveyContent deserialize(Decoder decoder) {
        int i11;
        WsContextualized wsContextualized;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = WsSurveyContent.access$get$childSerializers$cp();
        int i12 = 7;
        int i13 = 6;
        String str7 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 5);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 4, access$get$childSerializers$cp[4], null);
            str2 = decodeStringElement;
            wsContextualized = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 7, WsContextualized$$serializer.INSTANCE, null);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            str6 = decodeStringElement4;
            str5 = decodeStringElement3;
            str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            i11 = 255;
            str3 = decodeStringElement2;
        } else {
            boolean z5 = true;
            int i14 = 0;
            WsContextualized wsContextualized2 = null;
            String str8 = null;
            List list2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i12 = 7;
                        break;
                    case 0:
                        i14 |= 1;
                        str7 = beginStructure.decodeStringElement(descriptor2, 0);
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        str9 = beginStructure.decodeStringElement(descriptor2, 1);
                        i14 |= 2;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 2:
                        str10 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str10);
                        i14 |= 4;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 3:
                        str11 = beginStructure.decodeStringElement(descriptor2, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 4, access$get$childSerializers$cp[4], list2);
                        i14 |= 16;
                        break;
                    case 5:
                        str12 = beginStructure.decodeStringElement(descriptor2, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i13, StringSerializer.INSTANCE, str8);
                        i14 |= 64;
                        break;
                    case 7:
                        wsContextualized2 = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, i12, WsContextualized$$serializer.INSTANCE, wsContextualized2);
                        i14 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i14;
            wsContextualized = wsContextualized2;
            str = str8;
            list = list2;
            str2 = str7;
            str3 = str9;
            str4 = str10;
            str5 = str11;
            str6 = str12;
        }
        beginStructure.endStructure(descriptor2);
        return new WsSurveyContent(i11, str2, str3, str4, str5, list, str6, str, wsContextualized, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsSurveyContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsSurveyContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
