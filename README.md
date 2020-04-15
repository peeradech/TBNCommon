# TBNCommon
This module adds a number reusable Java methods to your project, which can be called from Microflows or custom Java actions. The module addes functionality for working with Dates, Microflows, Strings, Rules, Files, etc. See the documentation or screenshot for a complete list of functions.

## Description
This module adds a number reusable Java methods to your project, which can be called from Microflows or custom Java actions. 

The module addes functionality for working with Dates, Microflows, Strings, Rules, Files, etc. See the documentation or screenshot for a complete list of functions.
## Dependencies
**Library**
- poi-4.0.0.jar
- joda-time-2.9.6.jar
- commons.lang3.jar
- common-codec-1.11.jar
- mimemagic-0.1.0.jar
  
## Function List
### Dates

*FormatDateTimeWithLocale* - Format date and time with `Locale` (e.g. Language = `th`, Country = `TH`) to a String.

*IsValidDate* - Valid date equals a your format or not.

*ParseDateTimeWithLocale* - Convert string a date time to `Date` and `Time` with `Locale`
  
### Files

*CountLineFileExcel* - *`Waiting P'Saw`*

*HashFile* - Generate the `MD5/SHA1` checksum of a file.

*IsMatchFileType* - *`Waiting P'Saw`*

*IsMatchMimeType* - *`Waiting P'Saw`*

*MoveFileFromS3ToLocalSystem* - Move file from `FileDocument` to `Locale Storage` with Mendix structure.

*MoveFileFromS3ToLocalSystem* - Move file from your source path to `Locale Storage` with Mendix structure.

### String

*MaskEmail* - *`Waiting P'Saw`*

*MaskString* - *`Waiting P'Saw`*

### Other

  *Logout* - Signout *`Waiting P'Saw`*

### Microflow
#### Application Version
It's about of your application information via `model/metadata.json`.

*Usage:*
- **DS_Metadata** - Will return the Metadata entity.

#### Translate Amount
This microflow translate amount to Thai wording.

*Usage:*
- **TranslateAmount** - Convert decimal to Thai wording.

### Rules
*IsCitizenID* - Validate a Citizen ID of Thailand.

*IsDecimal* - *`Waiting P'Saw`*

*IsEmailFormat* - *`Waiting P'Saw`*

*IsHexColor* - Validation a string is Hex or not.

*IsMobile* - *`Waiting P'Saw`*

*IsNumber* - *`Waiting P'Saw`*

*IsString_EN* - *`Waiting P'Saw`*

*IsString_TH* - *`Waiting P'Saw`*

