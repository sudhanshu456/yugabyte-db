## yba xcluster restart

Restart replication for databases in the YugabyteDB Anywhere xCluster configuration

### Synopsis

Restart replication for databases in the YugabyteDB Anywhere xCluster configuration

```
yba xcluster restart [flags]
```

### Examples

```
yba xcluster restart --uuid <xcluster-uuid> --storage-config-name <storage-config-name>
```

### Options

```
  -u, --uuid string                  [Required] The uuid of the xcluster to restart.
      --storage-config-name string   [Required] Storage config to be used for taking the backup for replication. 
      --dry-run                      [Optional] Run the pre-checks without actually running the subtasks. (default false)
      --table-uuids string           [Optional] Comma separated list of source universe table IDs/UUIDs to restart. If not specified, all tables will be restarted.
      --parallelism int              [Optional] Number of concurrent commands to run on nodes over SSH via "yb_backup" script. (default 8)
      --force-delete                 [Optional] Force delete components of the universe xcluster despite errors during restart. May leave stale states and replication streams on the participating universes. (default false)
  -f, --force                        [Optional] Bypass the prompt for non-interactive usage.
  -h, --help                         help for restart
```

### Options inherited from parent commands

```
  -a, --apiToken string    YugabyteDB Anywhere api token.
      --ca-cert string     CA certificate file path for secure connection to YugabyteDB Anywhere. Required when the endpoint is https and --insecure is not set.
      --config string      Full path to a specific configuration file for YBA CLI. If provided, this takes precedence over the directory specified via --directory, and the generated files are added to the same path. If not provided, the CLI will look for '.yba-cli.yaml' in the directory specified by --directory. Defaults to '$HOME/.yba-cli/.yba-cli.yaml'.
      --debug              Use debug mode, same as --logLevel debug.
      --directory string   Directory containing YBA CLI configuration and generated files. If specified, the CLI will look for a configuration file named '.yba-cli.yaml' in this directory. Defaults to '$HOME/.yba-cli/'.
      --disable-color      Disable colors in output. (default false)
  -H, --host string        YugabyteDB Anywhere Host (default "http://localhost:9000")
      --insecure           Allow insecure connections to YugabyteDB Anywhere. Value ignored for http endpoints. Defaults to false for https.
  -l, --logLevel string    Select the desired log level format. Allowed values: debug, info, warn, error, fatal. (default "info")
  -o, --output string      Select the desired output format. Allowed values: table, json, pretty. (default "table")
      --timeout duration   Wait command timeout, example: 5m, 1h. (default 168h0m0s)
      --wait               Wait until the task is completed, otherwise it will exit immediately. (default true)
```

### SEE ALSO

* [yba xcluster](yba_xcluster.md)	 - Manage YugabyteDB Anywhere xClusters

