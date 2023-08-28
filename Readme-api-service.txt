In /etc/systemd/system create a file named doab-prism-widget.service with the following content:

[Unit]
Description=DOABooks Prism widget
After=syslog.target

[Service]
User=oapen
ExecStart=/home/oapen/doabapi/prismwidget.jar SuccessExitStatus=143

[Install]
WantedBy=multi-user.target
