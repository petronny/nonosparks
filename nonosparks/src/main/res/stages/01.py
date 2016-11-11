import json
stage='01'
data={}
data['width']=3
data['height']=3
data['name']='Hammer time'
data['hints']={}
data['hints']['horizontal']=['1','3','1']
data['hints']['vertical']=['3','1','1']
data['answer']=[]
data['answer'].append([1,1,1])
data['answer'].append([0,1,0])
data['answer'].append([0,1,0])
data['tips']='tips/01.json'
json.dump(data,open(stage+'.json','w'),sort_keys=True)
