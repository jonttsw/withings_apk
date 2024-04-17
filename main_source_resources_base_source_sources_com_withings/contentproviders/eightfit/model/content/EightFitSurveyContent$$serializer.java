package com.withings.contentproviders.eightfit.model.content;

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
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: EightFitSurveyContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/content/EightFitSurveyContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitSurveyContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/content/EightFitSurveyContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/content/EightFitSurveyContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EightFitSurveyContent$$serializer implements GeneratedSerializer<EightFitSurveyContent> {
    public static final EightFitSurveyContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EightFitSurveyContent$$serializer eightFitSurveyContent$$serializer = new EightFitSurveyContent$$serializer();
        INSTANCE = eightFitSurveyContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.content.EightFitSurveyContent", eightFitSurveyContent$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.FoodInfo.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("surveyId", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EightFitSurveyContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = EightFitSurveyContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, access$get$childSerializers$cp[1], BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EightFitSurveyContent deserialize(Decoder decoder) {
        int i11;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = EightFitSurveyContent.access$get$childSerializers$cp();
        String str6 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 1, access$get$childSerializers$cp[1], null);
            str = decodeStringElement;
            str5 = beginStructure.decodeStringElement(descriptor2, 5);
            str3 = decodeStringElement2;
            str4 = decodeStringElement3;
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            i11 = 63;
        } else {
            boolean z5 = true;
            int i12 = 0;
            List list2 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        continue;
                    case 0:
                        str6 = beginStructure.decodeStringElement(descriptor2, 0);
                        i12 |= 1;
                        continue;
                    case 1:
                        list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, access$get$childSerializers$cp[1], list2);
                        i12 |= 2;
                        break;
                    case 2:
                        str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str7);
                        i12 |= 4;
                        break;
                    case 3:
                        str8 = beginStructure.decodeStringElement(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        str9 = beginStructure.decodeStringElement(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        str10 = beginStructure.decodeStringElement(descriptor2, 5);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i12;
            str = str6;
            list = list2;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        beginStructure.endStructure(descriptor2);
        return new EightFitSurveyContent(i11, str, list, str2, str3, str4, str5, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, EightFitSurveyContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        EightFitSurveyContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
