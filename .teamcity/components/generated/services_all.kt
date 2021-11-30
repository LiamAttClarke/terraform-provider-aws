val services = mapOf(
    "accessanalyzer" to ServiceSpec("Access Analyzer"),
    "acm" to ServiceSpec("ACM"),
    "acmpca" to ServiceSpec("ACM PCA"),
    "amp" to ServiceSpec("AMP"),
    "amplify" to ServiceSpec("Amplify"),
    "apigateway" to ServiceSpec("API Gateway"),
    "apigatewayv2" to ServiceSpec("API Gateway v2"),
    "appautoscaling" to ServiceSpec("Application Auto Scaling"),
    "appconfig" to ServiceSpec("AppConfig"),
    "appmesh" to ServiceSpec("App Mesh"),
    "apprunner" to ServiceSpec("AppRunner"),
    "appstream" to ServiceSpec("AppStream"),
    "appsync" to ServiceSpec("AppSync"),
    "athena" to ServiceSpec("Athena"),
    "autoscaling" to ServiceSpec("Auto Scaling", vpcLock = true),
    "autoscalingplans" to ServiceSpec("Auto Scaling Plans"),
    "backup" to ServiceSpec("Backup"),
    "batch" to ServiceSpec("Batch"),
    "budgets" to ServiceSpec("Budgets"),
    "chime" to ServiceSpec("Chime"),
    "cloud9" to ServiceSpec("Cloud9"),
    "cloudcontrol" to ServiceSpec("CloudControl"),
    "cloudformation" to ServiceSpec("CloudFormation"),
    "cloudfront" to ServiceSpec("CloudFront"),
    "cloudhsmv2" to ServiceSpec("CloudHSM v2"),
    "cloudtrail" to ServiceSpec("CloudTrail"),
    "cloudwatch" to ServiceSpec("CloudWatch"),
    "cloudwatchevents" to ServiceSpec("CloudWatch Events"),
    "cloudwatchlogs" to ServiceSpec("CloudWatch Logs"),
    "codeartifact" to ServiceSpec("CodeArtifact"),
    "codebuild" to ServiceSpec("CodeBuild"),
    "codecommit" to ServiceSpec("CodeCommit"),
    "codedeploy" to ServiceSpec("CodeDeploy"),
    "codepipeline" to ServiceSpec("CodePipeline"),
    "codestarconnections" to ServiceSpec("CodeStar Connections"),
    "codestarnotifications" to ServiceSpec("CodeStar Notifications"),
    "cognitoidentity" to ServiceSpec("Cognito Identity"),
    "cognitoidp" to ServiceSpec("Cognito Identity Provider"),
    "configservice" to ServiceSpec("Config Service"),
    "connect" to ServiceSpec("Connect"),
    "cur" to ServiceSpec("Cost and Usage Report Service"),
    "dataexchange" to ServiceSpec("DataExchange"),
    "datapipeline" to ServiceSpec("Data Pipeline"),
    "datasync" to ServiceSpec("DataSync", vpcLock = true),
    "dax" to ServiceSpec("DAX"),
    "devicefarm" to ServiceSpec("Device Farm"),
    "directconnect" to ServiceSpec("Direct Connect"),
    "dlm" to ServiceSpec("DLM"),
    "dms" to ServiceSpec("Database Migration Service"),
    "docdb" to ServiceSpec("DocDB"),
    "ds" to ServiceSpec("Directory Service"),
    "dynamodb" to ServiceSpec("DynamoDB"),
    "ec2" to ServiceSpec("EC2", vpcLock = true),
    "ecr" to ServiceSpec("ECR"),
    "ecrpublic" to ServiceSpec("ECR Public"),
    "ecs" to ServiceSpec("ECS"),
    "efs" to ServiceSpec("EFS"),
    "eks" to ServiceSpec("EKS", vpcLock = true),
    "elasticache" to ServiceSpec("ElastiCache", vpcLock = true),
    "elasticbeanstalk" to ServiceSpec("Elastic Beanstalk"),
    "elasticsearch" to ServiceSpec("Elasticsearch Service", vpcLock = true),
    "elastictranscoder" to ServiceSpec("Elastic Transcoder"),
    "elb" to ServiceSpec("Elastic Load Balancing", vpcLock = true),
    "elbv2" to ServiceSpec("Elastic Load Balancing v2", vpcLock = true),
    "emr" to ServiceSpec("EMR", vpcLock = true),
    "firehose" to ServiceSpec("Firehose"),
    "fms" to ServiceSpec("FMS"),
    "fsx" to ServiceSpec("FSx", vpcLock = true),
    "gamelift" to ServiceSpec("GameLift"),
    "glacier" to ServiceSpec("Glacier"),
    "globalaccelerator" to ServiceSpec("Global Accelerator"),
    "glue" to ServiceSpec("Glue"),
    "greengrass" to ServiceSpec("Greengrass"),
    "guardduty" to ServiceSpec("GuardDuty"),
    "iam" to ServiceSpec("IAM"),
    "identitystore" to ServiceSpec("SSO Identitystore"),
    "imagebuilder" to ServiceSpec("EC2 Image Builder"),
    "inspector" to ServiceSpec("Inspector"),
    "iot" to ServiceSpec("IoT"),
    "iotanalytics" to ServiceSpec("IoT Analytics"),
    "iotevents" to ServiceSpec("IoT Events"),
    "kafka" to ServiceSpec("Kafka", vpcLock = true),
    "kinesis" to ServiceSpec("Kinesis"),
    "kinesisanalytics" to ServiceSpec("Kinesis Analytics"),
    "kinesisanalyticsv2" to ServiceSpec("Kinesis Analytics v2"),
    "kinesisvideo" to ServiceSpec("Kinesis Video"),
    "kms" to ServiceSpec("KMS"),
    "lakeformation" to ServiceSpec("LakeFormation"),
    "lambda" to ServiceSpec("Lambda", vpcLock = true),
    "lexmodels" to ServiceSpec("Lex Model Building Service"),
    "licensemanager" to ServiceSpec("License Manager"),
    "lightsail" to ServiceSpec("Lightsail"),
    "macie" to ServiceSpec("Macie"),
    "macie2" to ServiceSpec("Macie2"),
    "mediaconnect" to ServiceSpec("MediaConnect"),
    "mediaconvert" to ServiceSpec("MediaConvert"),
    "medialive" to ServiceSpec("MediaLive"),
    "mediapackage" to ServiceSpec("MediaPackage"),
    "mediastore" to ServiceSpec("MediaStore"),
    "meta" to ServiceSpec("Provider-level Data Sources"),
    "mq" to ServiceSpec("MQ"),
    "mwaa" to ServiceSpec("MWAA"),
    "neptune" to ServiceSpec("Neptune"),
    "networkfirewall" to ServiceSpec("Network Firewall", vpcLock = true),
    "networkmanager" to ServiceSpec("NetworkManager"),
    "opsworks" to ServiceSpec("OpsWorks", vpcLock = true),
    "organizations" to ServiceSpec("Organizations"),
    "outposts" to ServiceSpec("Outposts"),
    "pinpoint" to ServiceSpec("Pinpoint"),
    "pricing" to ServiceSpec("Pricing"),
    "qldb" to ServiceSpec("QLDB"),
    "quicksight" to ServiceSpec("QuickSight"),
    "ram" to ServiceSpec("RAM"),
    "rds" to ServiceSpec("RDS", vpcLock = true),
    "redshift" to ServiceSpec("Redshift", vpcLock = true),
    "resourcegroups" to ServiceSpec("Resource Groups"),
    "resourcegroupstaggingapi" to ServiceSpec("Resource Groups Tagging API"),
    "route53" to ServiceSpec("Route 53", vpcLock = true),
    "route53recoverycontrolconfig" to ServiceSpec("Route53 Recovery Control Config"),
    "route53recoveryreadiness" to ServiceSpec("Route53 Recovery Readiness"),
    "route53resolver" to ServiceSpec("Route53Resolver"),
    "s3" to ServiceSpec("S3"),
    "s3control" to ServiceSpec("S3 Control"),
    "s3outposts" to ServiceSpec("S3Outposts"),
    "sagemaker" to ServiceSpec("SageMaker", vpcLock = true),
    "schemas" to ServiceSpec("Schemas"),
    "secretsmanager" to ServiceSpec("Secrets Manager"),
    "securityhub" to ServiceSpec("SecurityHub"),
    "serverlessapprepo" to ServiceSpec("Serverless Application Repository"),
    "servicecatalog" to ServiceSpec("Service Catalog"),
    "servicediscovery" to ServiceSpec("ServiceDiscovery", vpcLock = true),
    "servicequotas" to ServiceSpec("Service Quotas"),
    "ses" to ServiceSpec("SES"),
    "sfn" to ServiceSpec("SFN"),
    "shield" to ServiceSpec("Shield"),
    "signer" to ServiceSpec("Signer"),
    "simpledb" to ServiceSpec("SimpleDB"),
    "sns" to ServiceSpec("SNS"),
    "sqs" to ServiceSpec("SQS"),
    "ssm" to ServiceSpec("SSM"),
    "ssoadmin" to ServiceSpec("SSO Admin"),
    "storagegateway" to ServiceSpec("Storage Gateway", vpcLock = true),
    "sts" to ServiceSpec("STS"),
    "swf" to ServiceSpec("SWF"),
    "synthetics" to ServiceSpec("Synthetics"),
    "timestreamwrite" to ServiceSpec("Timestream Write"),
    "transfer" to ServiceSpec("Transfer", vpcLock = true),
    "waf" to ServiceSpec("WAF"),
    "wafregional" to ServiceSpec("WAF Regional"),
    "wafv2" to ServiceSpec("WAF v2"),
    "worklink" to ServiceSpec("WorkLink"),
    "workspaces" to ServiceSpec("WorkSpaces", vpcLock = true),
    "xray" to ServiceSpec("XRay"),
)
